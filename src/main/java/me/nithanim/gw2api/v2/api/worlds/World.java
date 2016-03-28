package me.nithanim.gw2api.v2.api.worlds;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Getter
@lombok.EqualsAndHashCode
@lombok.ToString
public class World {
    private int id = -1;
    private String name;
    private Population population;

    public boolean isNorthAmerica() {
        return getRegionCode() == 1;
    }

    public boolean isEurope() {
        return getRegionCode() == 2;
    }

    public int getRegionCode() {
        return id / 1000;
    }

    public boolean isFrench() {
        return getLanguageCode() == 1;
    }

    public boolean isGerman() {
        return getLanguageCode() == 2;
    }

    public boolean isSpanish() {
        return getLanguageCode() == 3;
    }

    public int getLanguageCode() {
        return (id / 100) % 10;
    }
}
