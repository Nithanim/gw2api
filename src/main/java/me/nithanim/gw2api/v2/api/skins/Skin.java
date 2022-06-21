package me.nithanim.gw2api.v2.api.skins;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;

import lombok.ToString;
import lombok.Value;

@Value
// @Builder // TODO Re-introduce when JsonTypeIdResolver bug is fixed
// @Jacksonized
@JsonDeserialize(builder = Skin.SkinBuilder.class)
public class Skin {
  int id;
  String name;
  SkinType type;
  String rarity;
  List<String> flags;
  List<String> restrictions;
  String icon;
  String description;

  @JsonTypeInfo(
      use = JsonTypeInfo.Id.CUSTOM,
      include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
      property = "type",
      visible = true)
  @JsonTypeIdResolver(SkinTypeResolver.class)
  SkinDetails details;

  public static SkinBuilder builder() {
    return new SkinBuilder();
  }

  @ToString
  @JsonPOJOBuilder(withPrefix = "")
  public static class SkinBuilder {
    private int id = -1;
    private String name;
    private SkinType type;
    private String rarity;
    private List<String> flags;
    private List<String> restrictions;
    private String icon;
    private String description;
    private SkinDetails details;

    public SkinBuilder id(int id) {
      this.id = id;
      return this;
    }

    public SkinBuilder name(String name) {
      this.name = name;
      return this;
    }

    public SkinBuilder type(SkinType type) {
      this.type = type;
      return this;
    }

    public SkinBuilder rarity(String rarity) {
      this.rarity = rarity;
      return this;
    }

    public SkinBuilder flags(List<String> flags) {
      this.flags = flags;
      return this;
    }

    public SkinBuilder restrictions(List<String> restrictions) {
      this.restrictions = restrictions;
      return this;
    }

    public SkinBuilder icon(String icon) {
      this.icon = icon;
      return this;
    }

    public SkinBuilder description(String description) {
      this.description = description;
      return this;
    }

    @JsonTypeInfo(
        use = JsonTypeInfo.Id.CUSTOM,
        include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
        property = "type",
        visible = true)
    @JsonTypeIdResolver(SkinTypeResolver.class)
    public SkinBuilder details(SkinDetails details) {
      this.details = details;
      return this;
    }

    public Skin build() {
      return new Skin(id, name, type, rarity, flags, restrictions, icon, description, details);
    }
  }
}
