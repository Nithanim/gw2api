package me.nithanim.gw2api.v2.api.files;

import javax.ws.rs.client.WebTarget;

import me.nithanim.gw2api.v2.util.rest.DataUtil;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;

public class FilesResourceImpl implements FilesResource {
  private final WebTarget webTarget;

  public FilesResourceImpl(WebTarget webResource) {
    this.webTarget = webResource.path("files");
  }

  @Override
  public String[] getOverview() {
    return RequestHelper.INSTANCE.getRequest(webTarget, String[].class);
  }

  @Override
  public File get(String id) {
    return RequestHelper.INSTANCE.getRequest(webTarget.path(String.valueOf(id)), File.class);
  }

  @Override
  public File[] get(String[] ids) {
    return RequestHelper.INSTANCE.getRequest(
        webTarget, File[].class, "ids", DataUtil.stringstsToCommaSeparatedString(ids));
  }

  @Override
  public File[] getAll() {
    return RequestHelper.INSTANCE.getRequest(webTarget, File[].class, "ids", "all");
  }
}
