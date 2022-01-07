package datamanager.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BulbshareCommentStyle {

    @SerializedName("bg_color")
    @Expose
    private RGBColor bg_color;

    @SerializedName("font_color")
    @Expose
    private RGBColor font_color;

    @SerializedName("text_align")
    @Expose
    private String text_align;

    public RGBColor getBg_color() {
        return bg_color;
    }

    public void setBg_color(RGBColor bg_color) {
        this.bg_color = bg_color;
    }

    public RGBColor getFont_color() {
        return font_color;
    }

    public void setFont_color(RGBColor font_color) {
        this.font_color = font_color;
    }

    public String getText_align() {
        return text_align;
    }

    public void setText_align(String text_align) {
        this.text_align = text_align;
    }
}
