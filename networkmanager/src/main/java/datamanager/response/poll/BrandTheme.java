package datamanager.response.poll;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import datamanager.response.PrimaryColor;
import datamanager.response.SecondaryColor;

public class BrandTheme {

    @SerializedName("primary_color")
    @Expose
    private PrimaryColor primaryColor;

    @SerializedName("secondary_color")
    @Expose
    private SecondaryColor secondaryColor;

    @SerializedName("banner")
    @Expose
    private String banner;

    public PrimaryColor getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(PrimaryColor primaryColor) {
        this.primaryColor = primaryColor;
    }

    public SecondaryColor getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(SecondaryColor secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }
}
