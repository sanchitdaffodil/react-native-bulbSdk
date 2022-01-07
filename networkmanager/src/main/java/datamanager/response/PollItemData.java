package datamanager.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PollItemData implements Serializable {
    @SerializedName("value")
    @Expose
    public String value;
    @SerializedName("image")
    @Expose
    public String image;
    @SerializedName("overlay_text")
    @Expose
    public String overlay_text;
    @SerializedName("link")
    @Expose
    public String link;
    @SerializedName("link_text")
    @Expose
    public String link_text;
}