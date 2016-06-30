package me.nithanim.gw2api.v2.api.files;

import com.sun.jersey.api.client.WebResource;
import me.nithanim.gw2api.v2.util.rest.DataUtil;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

public class FilesResourceImpl implements FilesResource {
    private final WebResource webResource;

    public FilesResourceImpl(WebResource webResource) {
        this.webResource = webResource.path("files");
    }

    @Override
    public String[] getOverview() {
        return RequestHelper.INSTANCE.getRequest(webResource, String[].class);
    }

    @Override
    public File get(String id) {
        return RequestHelper.INSTANCE.getRequest(webResource.path(String.valueOf(id)), File.class);
    }

    @Override
    public File[] get(String[] ids) {
        return RequestHelper.INSTANCE.getRequest(webResource, File[].class, "ids", DataUtil.stringstsToCommaSeparatedString(ids));
    }

    @Override
    public File[] getAll() {
        return RequestHelper.INSTANCE.getRequest(webResource, File[].class, "ids", "all");
    }
}
