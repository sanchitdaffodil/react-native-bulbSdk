package datamanager.response.poll;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import datamanager.response.Bulbshare;

public class BulbshareBrandThemeResponse {

    @SerializedName("brand_theme")
    @Expose
    private BrandTheme brandTheme;

    @SerializedName("bulbshares")
    @Expose
    private ArrayList<Bulbshare> bulbshares = new ArrayList<>();

    public BrandTheme getBrandTheme() {
        return brandTheme;
    }

    public void setBrandTheme(BrandTheme brandTheme) {
        this.brandTheme = brandTheme;
    }

    public ArrayList<Bulbshare> getBulbshares() {
        return bulbshares;
    }

    public void setBulbshares(ArrayList<Bulbshare> bulbshares) {
        this.bulbshares = bulbshares;
    }
}
