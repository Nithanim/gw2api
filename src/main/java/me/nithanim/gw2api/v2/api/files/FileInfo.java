package me.nithanim.gw2api.v2.api.files;

public class FileInfo {
    private int id;
    private String icon;

    /**
     * The file identifier.
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * The URL to the image.
     *
     * @return
     */
    public String getIcon() {
        return icon;
    }
}
