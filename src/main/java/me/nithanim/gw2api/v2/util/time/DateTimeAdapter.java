package me.nithanim.gw2api.v2.util.time;

import java.lang.reflect.Type;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

public class DateTimeAdapter implements JsonDeserializer<DateTime> {
  public static final Type TYPE = new TypeToken<DateTime>() {}.getType();
  private static final DateTimeFormatter FORMATTER = ISODateTimeFormat.dateTimeNoMillis();

  @Override
  public DateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    // if (json.getAsString() == null || json.getAsString().isEmpty()) {
    //    return null;
    // }
    return FORMATTER.parseDateTime(json.getAsString());
  }
}
