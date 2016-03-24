package me.nithanim.gw2api.v2.configs;

import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.client.urlconnection.HTTPSProperties;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

/**
 * This configuartion is a workaround for the fact that ArenaNet switched their
 * certificate autority to godaddy.
 * <p>
 * According to
 * <a href="https://stackoverflow.com/questions/18746565/godaddy-ssl-cert-not-working-with-java">a
 * lot of awesome guys over at StackOverflow</a>
 * the certificate is included since Java 8 update 31 but that does not help us
 * very much with Java 7 and early Java 8 versions.</p>
 * <p>
 * <a href="http://tozny.com/blog/godaddys-ssl-certs-dont-work-in-java-the-right-solution/">Isaac
 * Potoczny-Jones states in his blog</a> that godaddy signes with their SHA-2
 * cert but only the SHA-1 is trusted by java. The fix is adding the
 * intermediate certificate manually.</p>
 * <p>
 * With the help of <a href="https://stackoverflow.com/a/24115112">jww at
 * StackOverflow</a>
 * we can now easily add the intermediate certificate at runtime.
 * </p>
 * <p>
 * And with the solution by <a href="https://stackoverflow.com/a/2684496">gmoore
 * at StackOverflow</a> we can tell jersey to use the new trustchain.
 * </p>
 */
public class GuildWars2ApiDefaultConfigWithGodaddyFix extends GuildWars2ApiDefaultConfig {
    @Override
    public ClientConfig getClientConfig() {
        try {
            DefaultClientConfig conf = new DefaultClientConfig();
            X509Certificate cert = getCertificate();

            KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
            ks.load(null, null);
            ks.setCertificateEntry(Integer.toString(1), cert);
            TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            tmf.init(ks);

            //https://stackoverflow.com/questions/2145431/https-using-jersey-client
            SSLContext ctx;
            try {
                ctx = SSLContext.getInstance("TLS");
            } catch (NoSuchAlgorithmException ex) {
                ctx = SSLContext.getInstance("SSL");
            }
            ctx.init(null, tmf.getTrustManagers(), null);
            ctx.createSSLEngine();
            conf.getProperties().put(HTTPSProperties.PROPERTY_HTTPS_PROPERTIES, new HTTPSProperties(null, ctx));
            return conf;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private X509Certificate getCertificate() {
        InputStream in = getCertificateInputStream();
        try {
            try {
                return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(in);
            } catch (CertificateException ex) {
                throw new RuntimeException(ex);
            }
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
            }
        }
    }

    private InputStream getCertificateInputStream() {
        return this.getClass().getClassLoader().getResourceAsStream("gdroot-g2_cross.crt");
    }
}
