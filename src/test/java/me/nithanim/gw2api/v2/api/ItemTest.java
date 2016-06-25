package me.nithanim.gw2api.v2.api;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import me.nithanim.gw2api.v2.GuildWars2Api;
import me.nithanim.gw2api.v2.api.items.ItemInfo;
import me.nithanim.gw2api.v2.util.rest.RequestHelper;
import me.nithanim.gw2api.v2.util.rest.TestRequestHelper;
import org.json.JSONException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

/**
 * Tests the correct parsing of items. The test uses all responses from items it
 * can find from the resource folder instead of calling the api to not only
 * speed up the tests but also to ensure that older versions can still
 * successfully built.
 */
@RunWith(Parameterized.class)
public class ItemTest {
    private static final Path itemsPath = Paths.get("src/test/resources/v2/raw/items/");

    @BeforeClass
    public static void setupClass() throws Exception {
        Field f = RequestHelper.class.getDeclaredField("INSTANCE");

        Field modField = Field.class.getDeclaredField("modifiers");
        modField.setAccessible(true);
        modField.setInt(f, modField.getInt(f) & ~Modifier.FINAL);

        f.set(null, new TestRequestHelper());
    }

    @Parameterized.Parameters(name = "of item with id {0}")
    public static Collection<Object[]> getTestParams() throws IOException {
        DirectoryStream<Path> files = Files.newDirectoryStream(itemsPath);

        ArrayList<Object[]> params = new ArrayList<>();

        for (Path file : files) {
            String rawId = getFileNameWithoutExt(file.getFileName().toString());

            int id = Integer.parseInt(rawId);
            params.add(new Object[]{id});
        }
        return params;
    }

    private static String getFileNameWithoutExt(String name) {
        return name.substring(0, name.lastIndexOf('.'));
    }

    private GuildWars2Api gw2api = new GuildWars2Api();
    private final int id;

    public ItemTest(int id) {
        this.id = id;
    }

    @Test
    public void testParsing() throws Exception {
        ItemInfo item = gw2api.items().get(id);
        Path itemPath = itemsPath.resolve(id + ".json");

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
}
