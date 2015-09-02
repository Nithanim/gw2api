package me.nithanim.gw2api.v2.api.files;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.ApiEndpoint;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

/**
 * This resource returns commonly requested in-game assets that may be used to enhance API-derived applications. 
 *
 * @see
 * <a href="https://wiki.guildwars2.com/wiki/API:2/files">GW2Wiki</a>
 */
public class FilesResource implements ApiEndpoint {
    private final WebResource webResource;

    public FilesResource(WebResource webResource) {
        this.webResource = webResource.path("files");
    }

    public String[] get() {
        return RequestHelper.getRequest(webResource, String[].class);
    }
    
    public FileInfo[] getAll() {
        return RequestHelper.getRequest(webResource, FileInfo[].class);
    }
    
    public FileInfo[] get(String[] ids) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ids.length; i++) {
            sb.append(ids[i]).append(',');
        }
        return RequestHelper.getRequest(webResource, FileInfo[].class, "ids", sb.toString());
    }
}
