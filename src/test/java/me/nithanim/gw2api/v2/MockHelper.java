package me.nithanim.gw2api.v2;

import com.sun.jersey.api.client.WebResource;
import javax.ws.rs.core.MediaType;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class MockHelper {
    public static WebResource getMockedWebResourceWithSubpath(String subpath, String jsonresult) {
        WebResource superWr = mock(WebResource.class);
        WebResource subWr = mock(WebResource.class);
        doReturn(subWr).when(superWr).path(subpath);

        //return builder when methods are called on WR and on the builder too (which has the same result)
        //makes the order of calling accept and header insensitive
        WebResource.Builder wrb = mock(WebResource.Builder.class);
        doReturn(wrb).when(subWr).header(anyString(), any());
        doReturn(wrb).when(subWr).accept((MediaType) any());
        doReturn(wrb).when(wrb).header(anyString(), any());
        doReturn(wrb).when(wrb).accept((MediaType) any());
        doReturn(jsonresult).when(wrb).get(String.class);
        return superWr;
    }
}
