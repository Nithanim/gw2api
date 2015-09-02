package me.nithanim.gw2api.v2.api.colors;

import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Color {
    private int id;
    private String name;
    private byte[] baseRgb;
    private Appearence cloth;
    private Appearence leather;
    private Appearence metal;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public byte[] getBaseRgb() {
        return baseRgb;
    }

    public Appearence getAppearenceOnCloth() {
        return cloth;
    }

    public Appearence getAppearenceOnLeather() {
        return leather;
    }

    public Appearence getAppearenceOnMetal() {
        return metal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Arrays.hashCode(this.baseRgb);
        hash = 23 * hash + Objects.hashCode(this.cloth);
        hash = 23 * hash + Objects.hashCode(this.leather);
        hash = 23 * hash + Objects.hashCode(this.metal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Color other = (Color) obj;
        return this.id != other.id
            && Objects.equals(this.name, other.name)
            && Arrays.equals(this.baseRgb, other.baseRgb)
            && Objects.equals(this.cloth, other.cloth)
            && Objects.equals(this.leather, other.leather)
            && Objects.equals(this.metal, other.metal);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static class Appearence {
        private byte brightness;
        private double contrast;
        private byte hue;
        private double saturation;
        private double lightness;
        private byte[] rgb;

        public byte getBrightness() {
            return brightness;
        }

        public double getContrast() {
            return contrast;
        }

        public byte getHue() {
            return hue;
        }

        public double getSaturation() {
            return saturation;
        }

        public double getLightness() {
            return lightness;
        }

        public byte[] getRgb() {
            return rgb;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            final Appearence other = (Appearence) obj;
            return this.brightness == other.brightness
                && Double.doubleToLongBits(this.contrast) == Double.doubleToLongBits(other.contrast)
                && this.hue == other.hue
                && Double.doubleToLongBits(this.saturation) == Double.doubleToLongBits(other.saturation)
                && Double.doubleToLongBits(this.lightness) == Double.doubleToLongBits(other.lightness)
                && Arrays.equals(this.rgb, other.rgb);
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + this.brightness;
            hash = 59 * hash + (int) (Double.doubleToLongBits(this.contrast) ^ (Double.doubleToLongBits(this.contrast) >>> 32));
            hash = 59 * hash + this.hue;
            hash = 59 * hash + (int) (Double.doubleToLongBits(this.saturation) ^ (Double.doubleToLongBits(this.saturation) >>> 32));
            hash = 59 * hash + (int) (Double.doubleToLongBits(this.lightness) ^ (Double.doubleToLongBits(this.lightness) >>> 32));
            hash = 59 * hash + Arrays.hashCode(this.rgb);
            return hash;
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }

}
