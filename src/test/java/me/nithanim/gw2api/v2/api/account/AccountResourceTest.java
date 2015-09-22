package me.nithanim.gw2api.v2.api.account;

import com.sun.jersey.api.client.WebResource;
import javax.ws.rs.core.MediaType;
import me.nithanim.gw2api.v2.GuildWars2Api;
import me.nithanim.gw2api.v2.MockHelper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AccountResourceTest {

    private static final String API_KEY = "AAAAAAAA-AAAA-AAAA-AAAA-AAAAAAAAAAAAAAAAAAAA-AAAA-AAAA-AAAA-AAAAAAAAAAAA";

    public AccountResourceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAccount() {
        String apiResult = "{\"id\":\"C25B6B91-7FF2-E111-809D-78E7D1936EF0\",\"name\":\"Nithanim.5243\",\"world\":2206,\"guilds\":[\"2D811245-A33B-4169-AF9F-A69B4EB7F0FD\",\"E1A1D4B0-6710-4DC3-9D5C-0F119BC3D2F8\"],\"created\":\"2012-08-30T08:47:00Z\"}";
        WebResource wr = MockHelper.getMockedWebResourceWithSubpath("account", apiResult);
        

        Account expected = GuildWars2Api.GSON.fromJson(apiResult, Account.class);

        AccountResource ar = new AccountResource(wr);
        Account actual = ar.get(API_KEY);
        
        verify(wr.path("account").accept(MediaType.APPLICATION_JSON_TYPE)).header("Authorization", "Bearer " + API_KEY);
        assertEquals(expected, actual);
    }
}
