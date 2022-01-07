package datamanager.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Brand implements Serializable {
    @SerializedName("brandid")
    @Expose
    private Integer brandid;
    @SerializedName("brandref")
    @Expose
    private String brandref;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("likesCount")
    @Expose
    private Integer likesCount;
    @SerializedName("followersCount")
    @Expose
    private Integer followersCount;
    @SerializedName("isDiscoverable")
    @Expose
    private Boolean isDiscoverable;
    @SerializedName("discoverTitle")
    @Expose
    private String discoverTitle;
    @SerializedName("discoverAbout")
    @Expose
    private String discoverAbout;
    @SerializedName("discoveryCountry")
    @Expose
    private Object discoveryCountry;
    @SerializedName("requireScreener")
    @Expose
    private Boolean requireScreener;
    @SerializedName("screenerUrl")
    @Expose
    private String screenerUrl;
    @SerializedName("screenerBriefid")
    @Expose
    private Object screenerBriefid;
    @SerializedName("briefMaxResponsesLimit")
    @Expose
    private String briefMaxResponsesLimit;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("isPrivate")
    @Expose
    private Boolean isPrivate;
    @SerializedName("organisationid")
    @Expose
    private String organisationid;
    @SerializedName("languageId")
    @Expose
    private String languageId;
    @SerializedName("languageName")
    @Expose
    private String languageName;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("isFollowedByMe")
    @Expose
    private Boolean isFollowedByMe;
    @SerializedName("primary_color")
    @Expose
    private PrimaryColor primaryColor;
    @SerializedName("secondary_color")
    @Expose
    private SecondaryColor secondaryColor;

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getBrandref() {
        return brandref;
    }

    public void setBrandref(String brandref) {
        this.brandref = brandref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public Boolean getIsDiscoverable() {
        return isDiscoverable;
    }

    public void setIsDiscoverable(Boolean isDiscoverable) {
        this.isDiscoverable = isDiscoverable;
    }

    public String getDiscoverTitle() {
        return discoverTitle;
    }

    public void setDiscoverTitle(String discoverTitle) {
        this.discoverTitle = discoverTitle;
    }

    public String getDiscoverAbout() {
        return discoverAbout;
    }

    public void setDiscoverAbout(String discoverAbout) {
        this.discoverAbout = discoverAbout;
    }

    public Object getDiscoveryCountry() {
        return discoveryCountry;
    }

    public void setDiscoveryCountry(Object discoveryCountry) {
        this.discoveryCountry = discoveryCountry;
    }

    public Boolean getRequireScreener() {
        return requireScreener;
    }

    public void setRequireScreener(Boolean requireScreener) {
        this.requireScreener = requireScreener;
    }

    public String getScreenerUrl() {
        return screenerUrl;
    }

    public void setScreenerUrl(String screenerUrl) {
        this.screenerUrl = screenerUrl;
    }

    public Object getScreenerBriefid() {
        return screenerBriefid;
    }

    public void setScreenerBriefid(Object screenerBriefid) {
        this.screenerBriefid = screenerBriefid;
    }

    public String getBriefMaxResponsesLimit() {
        return briefMaxResponsesLimit;
    }

    public void setBriefMaxResponsesLimit(String briefMaxResponsesLimit) {
        this.briefMaxResponsesLimit = briefMaxResponsesLimit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getOrganisationid() {
        return organisationid;
    }

    public void setOrganisationid(String organisationid) {
        this.organisationid = organisationid;
    }

    public String getLanguageId() {
        return languageId;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getIsFollowedByMe() {
        return isFollowedByMe;
    }

    public void setIsFollowedByMe(Boolean isFollowedByMe) {
        this.isFollowedByMe = isFollowedByMe;
    }

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
}

