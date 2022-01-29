package me.nithanim.gw2api.v2.api;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import me.nithanim.gw2api.v2.GuildWars2Api;
import me.nithanim.gw2api.v2.ResourceHelper;
import me.nithanim.gw2api.v2.api.items.ItemInfo;

@RunWith(Parameterized.class)
public class ItemTest2 extends JerseyTest {
  private static final java.nio.file.Path itemsPath = Paths.get("src/test/resources/v2/raw/items/");
  private GuildWars2Api api;
  private int id;

  public ItemTest2(int id) {
    this.id = id;
  }

  @Parameterized.Parameters(name = "of item with id {0}")
  public static Collection<Object[]> getTestParams() throws IOException {
    DirectoryStream<java.nio.file.Path> files = Files.newDirectoryStream(itemsPath);

    ArrayList<Object[]> params = new ArrayList<>();

    for (java.nio.file.Path file : files) {
      String rawId = getFileNameWithoutExt(file.getFileName().toString());

      int id = Integer.parseInt(rawId);
      params.add(new Object[] {id});
    }
    return params;
  }

  private static String getFileNameWithoutExt(String name) {
    return name.substring(0, name.lastIndexOf('.'));
  }

  @Before
  @SuppressWarnings("deprecation")
  @Override
  public void setUp() throws Exception {
    super.setUp();
    api = new GuildWars2Api(getClient(), target());
  }

  @Override
  protected Application configure() {
    return new ResourceConfig(ServerResource.class);
  }

  @Test
  public void testParsing() throws Exception {
    ItemInfo item = api.items().get(id);
    java.nio.file.Path itemPath = itemsPath.resolve(id + ".json");

    String rawJson = new String(Files.readAllBytes(itemPath), StandardCharsets.UTF_8);
    String reJson = GuildWars2Api.GSON.toJson(item);
    System.out.println("Test item " + id);
    System.out.println(rawJson);
    System.out.println(reJson);

    try {
      JSONAssert.assertEquals(rawJson, reJson, JSONCompareMode.LENIENT);
    } catch (JSONException ex) {
      throw new RuntimeException("Unable to compare original json with serialized api object", ex);
    }
  }

  @Path("/items/{id}")
  public static class ServerResource {
    @GET
    public static String get(@PathParam("id") String id) {
      return ResourceHelper.getRawApiResponse("items", id);
    }
  }
}
