package me.nithanim.gw2api.v2.util.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

public interface IdsResourceWsInt<DATA_CLASS> {

  @GET
  int[] getOverview();

  @GET
  int[] getOverviewProtected(@QueryParam("access_token") String apikey);

  @GET
  @Path("{id}")
  DATA_CLASS getSingle(@PathParam("id") int id);

  @GET
  @Path("{id}")
  DATA_CLASS getSingleProtected(@PathParam("id") int id, @QueryParam("access_token") String apikey);

  @GET
  @Path("{id}")
  DATA_CLASS getSingle(@PathParam("id") int id, @QueryParam("lang") String lang);

  @GET
  @Path("{id}")
  DATA_CLASS getSingleProtected(
      @PathParam("id") int id,
      @QueryParam("lang") String lang,
      @QueryParam("access_token") String apikey);

  List<DATA_CLASS> getMultiple(@QueryParam("ids") String ids);

  List<DATA_CLASS> getMultipleProtected(
      @QueryParam("ids") String ids, @QueryParam("access_token") String apikey);

  List<DATA_CLASS> getMultiple(@QueryParam("ids") String ids, @QueryParam("lang") String lang);

  List<DATA_CLASS> getMultipleProtected(
      @QueryParam("ids") String ids,
      @QueryParam("lang") String lang,
      @QueryParam("access_token") String apikey);
}