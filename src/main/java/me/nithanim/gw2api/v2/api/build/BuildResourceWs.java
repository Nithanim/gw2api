package me.nithanim.gw2api.v2.api.build;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("build")
public interface BuildResourceWs {
  @GET
  Build get();
}
