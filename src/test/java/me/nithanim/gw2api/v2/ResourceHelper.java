package me.nithanim.gw2api.v2;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ResourceHelper {
    public static final Gson GSON = new Gson();

    public static String getRawApiResponse(String cat, String id) {
        try {
            InputStream in = ResourceHelper.class.getClassLoader().getClass().getResourceAsStream(
                "/v2/raw/" + cat + "/" + id + ".json");
            return inputStreamToString(in);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static String inputStreamToString(InputStream is) throws IOException {
        if (is == null) {
            throw new IllegalArgumentException("InputStream was null!");
        }
        final int bufferSize = 1024;
        final char[] buffer = new char[bufferSize];
        final StringBuilder out = new StringBuilder();
        Reader in = new InputStreamReader(is, "UTF-8");
        for (;;) {
            int rsz = in.read(buffer, 0, buffer.length);
            if (rsz < 0) {
                break;
            }
            out.append(buffer, 0, rsz);
        }
        return out.toString();
    }

    private ResourceHelper() {
    }
}
