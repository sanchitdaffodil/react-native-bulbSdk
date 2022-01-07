package datamanager.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Channel{
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
    private Object languageId;
    @SerializedName("canSubmitResponse")
    @Expose
    private String canSubmitResponse;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("longDescription")
    @Expose
    private String longDescription;
    @SerializedName("brief_count")
    @Expose
    private String briefCount;
    @SerializedName("userHasAccess")
    @Expose
    private Boolean userHasAccess;
    @SerializedName("theme")
    @Expose
    private Theme theme;
    @SerializedName("banner")
    @Expose
    private String banner;

    public String getBanner() {
        return banner;
    }
    public void setBanner(Integer brandid) {
        this.banner = banner;
    }


    public int getBrandid() {
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
    public Object getLanguageId() {
        return languageId;
    }
    public void setLanguageId(Object languageId) {
        this.languageId = languageId;
    }
    public String getCanSubmitResponse() {
        return canSubmitResponse;
    }
    public void setCanSubmitResponse(String canSubmitResponse) {
        this.canSubmitResponse = canSubmitResponse;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getLongDescription() {
        return longDescription;
    }
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    public String getBriefCount() {
        return briefCount;
    }
    public void setBriefCount(String briefCount) {
        this.briefCount = briefCount;
    }
    public Boolean getUserHasAccess() {
        return userHasAccess;
    }
    public void setUserHasAccess(Boolean userHasAccess) {
        this.userHasAccess = userHasAccess;
    }
    public Theme getTheme() {
        return theme;
    }
    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "brandid=" + brandid +
                ", brandref='" + brandref + '\'' +
                ", name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", likesCount=" + likesCount +
                ", followersCount=" + followersCount +
                ", isDiscoverable=" + isDiscoverable +
                ", discoverTitle='" + discoverTitle + '\'' +
                ", discoverAbout='" + discoverAbout + '\'' +
                ", discoveryCountry=" + discoveryCountry +
                ", requireScreener=" + requireScreener +
                ", screenerUrl='" + screenerUrl + '\'' +
                ", screenerBriefid=" + screenerBriefid +
                ", briefMaxResponsesLimit='" + briefMaxResponsesLimit + '\'' +
                ", status='" + status + '\'' +
                ", isPrivate=" + isPrivate +
                ", organisationid='" + organisationid + '\'' +
                ", languageId=" + languageId +
                ", canSubmitResponse='" + canSubmitResponse + '\'' +
                ", description='" + description + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", briefCount='" + briefCount + '\'' +
                ", userHasAccess=" + userHasAccess +
                ", theme=" + theme +
                ", banner='" + banner + '\'' +
                '}';
    }
}
