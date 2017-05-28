package me.nithanim.gw2api.v2.util.gson.achievements;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import me.nithanim.gw2api.v2.api.achievements.DailyAchievement;

public class DailyAchievementsJsonDeserializer implements JsonDeserializer<DailyAchievement> {
    @Override
    public DailyAchievement deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject e = (JsonObject) json;
        int id = e.get("id").getAsInt();
        JsonObject level = e.get("level").getAsJsonObject();
        int levelMin = level.get("min").getAsInt();
        int levelMax = level.get("max").getAsInt();
        String[] requiredAccess = context.deserialize(level.get("required_access"), String[].class);

        return new DailyAchievement(id, levelMin, levelMax, requiredAccess);
    }
}
