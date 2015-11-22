package me.nithanim.gw2api.v2.util.rest;

public class DataUtil {
    public static String intsToCommaSeparatedString(int[] ints) {
        StringBuilder sb = new StringBuilder(ints.length * 5 + ints.length);
        for (int i = 0; i < ints.length; i++) {
            sb.append(ints[i]).append(',');
        }
        return sb.toString();
    }

    public static String stringstsToCommaSeparatedString(String[] strings) {
        StringBuilder sb = new StringBuilder(strings.length * 5 + strings.length);
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]).append(',');
        }
        return sb.toString();
    }
}
