package datamanager.response;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public  class Briefs implements Serializable {
    @SerializedName("briefref")
    @Expose
    private String briefref;

    @SerializedName("brand")
    @Expose
    private Brand brand;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("internalName")
    @Expose
    private String internalName;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("cover_photo")
    @Expose
    private String coverPhoto;

    @SerializedName("cover_video_mobile")
    @Expose
    private String coverVideoMobile;

    @SerializedName("coverVideoWeb")
    @Expose
    private String coverVideoWeb;

    @SerializedName("intro_text")
    @Expose
    private String introText;

    @SerializedName("feed_title")
    @Expose
    private String feedTitle;

    @SerializedName("banner_image")
    @Expose
    private String bannerImage;

    @SerializedName("bannerVideo")
    @Expose
    private String bannerVideo;

    @SerializedName("banner_text")
    @Expose
    private String bannerText;

    @SerializedName("ad_1_image")
    @Expose
    private String ad1Image;

    @SerializedName("ad_1_href")
    @Expose
    private String ad1Href;

    @SerializedName("ad_2_text")
    @Expose
    private String ad2Text;

    @SerializedName("ad_2_image")
    @Expose
    private String ad2Image;

    @SerializedName("ad_2_href")
    @Expose
    private String ad2Href;

    @SerializedName("rewardImage")
    @Expose
    private String rewardImage;

    @SerializedName("rewardText")
    @Expose
    private String rewardText;

    @SerializedName("bsPictureRequired")
    @Expose
    private Boolean bsPictureRequired;

    @SerializedName("bsPictureText")
    @Expose
    private String bsPictureText;

    @SerializedName("bsVideoRequired")
    @Expose
    private Boolean bsVideoRequired;

    @SerializedName("bsVideoText")
    @Expose
    private String bsVideoText;


    @SerializedName("bsCommentRequired")
    @Expose
    private Boolean bsCommentRequired;

    @SerializedName("bsCommentText")
    @Expose
    private String bsCommentText;

    @SerializedName("bsAllowLongVideo")
    @Expose
    private Boolean bsAllowLongVideo;

    @SerializedName("starts_on")
    @Expose
    private String startsOn;


    @SerializedName("ends_on")
    @Expose
    private String endsOn;

    @SerializedName("commsSentOn")
    @Expose
    private Object commsSentOn;

    @SerializedName("introductionTitle")
    @Expose
    private String introductionTitle;

    @SerializedName("introductionSubtitle")
    @Expose
    private String introductionSubtitle;

    @SerializedName("introductionBody")
    @Expose
    private String introductionBody;

    @SerializedName("introductionImage")
    @Expose
    private String introductionImage;

    @SerializedName("audition")
    @Expose
    private Boolean audition;

    @SerializedName("auditionTitle")
    @Expose
    private String auditionTitle;

    @SerializedName("auditionSubtitle")
    @Expose
    private String auditionSubtitle;


    @SerializedName("auditionSuccessImage")
    @Expose
    private String auditionSuccessImage;


    @SerializedName("auditionSuccessText")
    @Expose
    private String auditionSuccessText;

    @SerializedName("trackingUrl")
    @Expose
    private String trackingUrl;

    @SerializedName("trackingFailureUrl")
    @Expose
    private String trackingFailureUrl;

    @SerializedName("type")
    @Expose
    private Integer type;

    @SerializedName("briefType")
    @Expose
    private String briefType;

    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;

    @SerializedName("bulbshares_count")
    @Expose
    private Integer bulbsharesCount;

    @SerializedName("responses_count")
    @Expose
    private Integer responsesCount;

    @SerializedName("comments_count")
    @Expose
    private Integer commentsCount;

    @SerializedName("responseLimit")
    @Expose
    private Integer responseLimit;

    @SerializedName("max_responses")
    @Expose
    private Integer maxResponses;

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("is_private")
    @Expose
    private Boolean isPrivate;

    @SerializedName("is_public")
    @Expose
    private Boolean isPublic;

    @SerializedName("is_activated")
    @Expose
    private Boolean isActivated;

    @SerializedName("isHidden")
    @Expose
    private String isHidden;

    @SerializedName("isEnrichment")
    @Expose
    private String isEnrichment;

    @SerializedName("organisationid")
    @Expose
    private String organisationid;

    @SerializedName("templateBriefId")
    @Expose
    private String templateBriefId;

    @SerializedName("translateResponses")
    @Expose
    private String translateResponses;

    @SerializedName("translateResponsesEngine")
    @Expose
    private String translateResponsesEngine;

    @SerializedName("translateFrom")
    @Expose
    private String translateFrom;

    @SerializedName("translateTo")
    @Expose
    private String translateTo;

    @SerializedName("projectId")
    @Expose
    private Object projectId;

    @SerializedName("templateOrganisationId")
    @Expose
    private Object templateOrganisationId;

    @SerializedName("languageId")
    @Expose
    private String languageId;

    @SerializedName("bvProductId")
    @Expose
    private Object bvProductId;

    @SerializedName("bvProductName")
    @Expose
    private String bvProductName;

    @SerializedName("bvIncentivised")
    @Expose
    private Object bvIncentivised;

    @SerializedName("user_responses_count")
    @Expose
    private Integer userResponsesCount;

    @SerializedName("targeting")
    @Expose
    private Object targeting;

    @SerializedName("user_has_responded")
    @Expose
    private Boolean userHasResponded;

    @SerializedName("isWelcome")
    @Expose
    private String isWelcome;

    @SerializedName("can_submit_bulbshares")
    @Expose
    private Boolean canSubmitBulbshares;

    @SerializedName("can_answer_poll")
    @Expose
    private Boolean canAnswerPoll;

    @SerializedName("was_liked_by_me")
    @Expose
    private Boolean wasLikedByMe;

    @SerializedName("rewards")
    @Expose
    private Object rewards;

    @SerializedName("isSyndicationBrief")
    @Expose
    private Boolean isSyndicationBrief;

    @SerializedName("brandname")
    @Expose
    private String brandName;

    public Boolean getPrivate() {
        return isPrivate;
    }

    public void setPrivate(Boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    public Boolean getActivated() {
        return isActivated;
    }

    public void setActivated(Boolean activated) {
        isActivated = activated;
    }

    public Boolean getSyndicationBrief() {
        return isSyndicationBrief;
    }

    public void setSyndicationBrief(Boolean syndicationBrief) {
        isSyndicationBrief = syndicationBrief;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    private ArrayList<String> features = new ArrayList<String>();

    public String getBriefref() {
        return briefref;
    }
    public void setBriefref(String briefref) {
        this.briefref = briefref;
    }
    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getInternalName() {
        return internalName;
    }
    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCoverPhoto() {
        return coverPhoto;
    }
    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }
    public String getCoverVideoMobile() {
        return coverVideoMobile;
    }
    public void setCoverVideoMobile(String coverVideoMobile) {
        this.coverVideoMobile = coverVideoMobile;
    }
    public String getCoverVideoWeb() {
        return coverVideoWeb;
    }
    public void setCoverVideoWeb(String coverVideoWeb) {
        this.coverVideoWeb = coverVideoWeb;
    }
    public String getIntroText() {
        return introText;
    }
    public void setIntroText(String introText) {
        this.introText = introText;
    }
    public String getFeedTitle() {
        return feedTitle;
    }
    public void setFeedTitle(String feedTitle) {
        this.feedTitle = feedTitle;
    }
    public String getBannerImage() {
        return bannerImage;
    }
    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }
    public String getBannerVideo() {
        return bannerVideo;
    }
    public void setBannerVideo(String bannerVideo) {
        this.bannerVideo = bannerVideo;
    }
    public String getBannerText() {
        return bannerText;
    }
    public void setBannerText(String bannerText) {
        this.bannerText = bannerText;
    }
    public String getAd1Image() {
        return ad1Image;
    }
    public void setAd1Image(String ad1Image) {
        this.ad1Image = ad1Image;
    }
    public String getAd1Href() {
        return ad1Href;
    }
    public void setAd1Href(String ad1Href) {
        this.ad1Href = ad1Href;
    }
    public String getAd2Text() {
        return ad2Text;
    }
    public void setAd2Text(String ad2Text) {
        this.ad2Text = ad2Text;
    }
    public String getAd2Image() {
        return ad2Image;
    }
    public void setAd2Image(String ad2Image) {
        this.ad2Image = ad2Image;
    }
    public String getAd2Href() {
        return ad2Href;
    }
    public void setAd2Href(String ad2Href) {
        this.ad2Href = ad2Href;
    }
    public String getRewardImage() {
        return rewardImage;
    }
    public void setRewardImage(String rewardImage) {
        this.rewardImage = rewardImage;
    }
    public String getRewardText() {
        return rewardText;
    }
    public void setRewardText(String rewardText) {
        this.rewardText = rewardText;
    }
    public Boolean getBsPictureRequired() {
        return bsPictureRequired;
    }
    public void setBsPictureRequired(Boolean bsPictureRequired) {
        this.bsPictureRequired = bsPictureRequired;
    }
    public String getBsPictureText() {
        return bsPictureText;
    }
    public void setBsPictureText(String bsPictureText) {
        this.bsPictureText = bsPictureText;
    }
    public Boolean getBsVideoRequired() {
        return bsVideoRequired;
    }
    public void setBsVideoRequired(Boolean bsVideoRequired) {
        this.bsVideoRequired = bsVideoRequired;
    }
    public String getBsVideoText() {
        return bsVideoText;
    }
    public void setBsVideoText(String bsVideoText) {
        this.bsVideoText = bsVideoText;
    }
    public Boolean getBsCommentRequired() {
        return bsCommentRequired;
    }
    public void setBsCommentRequired(Boolean bsCommentRequired) {
        this.bsCommentRequired = bsCommentRequired;
    }
    public String getBsCommentText() {
        return bsCommentText;
    }
    public void setBsCommentText(String bsCommentText) {
        this.bsCommentText = bsCommentText;
    }
    public Boolean getBsAllowLongVideo() {
        return bsAllowLongVideo;
    }
    public void setBsAllowLongVideo(Boolean bsAllowLongVideo) {
        this.bsAllowLongVideo = bsAllowLongVideo;
    }
    public String getStartsOn() {
        return startsOn;
    }
    public void setStartsOn(String startsOn) {
        this.startsOn = startsOn;
    }
    public String getEndsOn() {
        return endsOn;
    }
    public void setEndsOn(String endsOn) {
        this.endsOn = endsOn;
    }
    public Object getCommsSentOn() {
        return commsSentOn;
    }
    public void setCommsSentOn(Object commsSentOn) {
        this.commsSentOn = commsSentOn;
    }
    public String getIntroductionTitle() {
        return introductionTitle;
    }
    public void setIntroductionTitle(String introductionTitle) {
        this.introductionTitle = introductionTitle;
    }
    public String getIntroductionSubtitle() {
        return introductionSubtitle;
    }
    public void setIntroductionSubtitle(String introductionSubtitle) {
        this.introductionSubtitle = introductionSubtitle;
    }
    public String getIntroductionBody() {
        return introductionBody;
    }
    public void setIntroductionBody(String introductionBody) {
        this.introductionBody = introductionBody;
    }
    public String getIntroductionImage() {
        return introductionImage;
    }
    public void setIntroductionImage(String introductionImage) {
        this.introductionImage = introductionImage;
    }
    public Boolean getAudition() {
        return audition;
    }
    public void setAudition(Boolean audition) {
        this.audition = audition;
    }
    public String getAuditionTitle() {
        return auditionTitle;
    }
    public void setAuditionTitle(String auditionTitle) {
        this.auditionTitle = auditionTitle;
    }
    public String getAuditionSubtitle() {
        return auditionSubtitle;
    }
    public void setAuditionSubtitle(String auditionSubtitle) {
        this.auditionSubtitle = auditionSubtitle;
    }
    public String getAuditionSuccessImage() {
        return auditionSuccessImage;
    }
    public void setAuditionSuccessImage(String auditionSuccessImage) {
        this.auditionSuccessImage = auditionSuccessImage;
    }
    public String getAuditionSuccessText() {
        return auditionSuccessText;
    }
    public void setAuditionSuccessText(String auditionSuccessText) {
        this.auditionSuccessText = auditionSuccessText;
    }
    public String getTrackingUrl() {
        return trackingUrl;
    }
    public void setTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }
    public String getTrackingFailureUrl() {
        return trackingFailureUrl;
    }
    public void setTrackingFailureUrl(String trackingFailureUrl) {
        this.trackingFailureUrl = trackingFailureUrl;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public String getBriefType() {
        return briefType;
    }
    public void setBriefType(String briefType) {
        this.briefType = briefType;
    }
    public Integer getLikesCount() {
        return likesCount;
    }
    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }
    public Integer getBulbsharesCount() {
        return bulbsharesCount;
    }
    public void setBulbsharesCount(Integer bulbsharesCount) {
        this.bulbsharesCount = bulbsharesCount;
    }
    public Integer getResponsesCount() {
        return responsesCount;
    }
    public void setResponsesCount(Integer responsesCount) {
        this.responsesCount = responsesCount;
    }
    public Integer getCommentsCount() {
        return commentsCount;
    }
    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }
    public Integer getResponseLimit() {
        return responseLimit;
    }
    public void setResponseLimit(Integer responseLimit) {
        this.responseLimit = responseLimit;
    }
    public Integer getMaxResponses() {
        return maxResponses;
    }
    public void setMaxResponses(Integer maxResponses) {
        this.maxResponses = maxResponses;
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
    public Boolean getIsPublic() {
        return isPublic;
    }
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }
    public Boolean getIsActivated() {
        return isActivated;
    }
    public void setIsActivated(Boolean isActivated) {
        this.isActivated = isActivated;
    }
    public String getIsHidden() {
        return isHidden;
    }
    public void setIsHidden(String isHidden) {
        this.isHidden = isHidden;
    }
    public String getIsEnrichment() {
        return isEnrichment;
    }
    public void setIsEnrichment(String isEnrichment) {
        this.isEnrichment = isEnrichment;
    }
    public String getOrganisationid() {
        return organisationid;
    }
    public void setOrganisationid(String organisationid) {
        this.organisationid = organisationid;
    }
    public String getTemplateBriefId() {
        return templateBriefId;
    }
    public void setTemplateBriefId(String templateBriefId) {
        this.templateBriefId = templateBriefId;
    }
    public String getTranslateResponses() {
        return translateResponses;
    }
    public void setTranslateResponses(String translateResponses) {
        this.translateResponses = translateResponses;
    }
    public String getTranslateResponsesEngine() {
        return translateResponsesEngine;
    }
    public void setTranslateResponsesEngine(String translateResponsesEngine) {
        this.translateResponsesEngine = translateResponsesEngine;
    }
    public String getTranslateFrom() {
        return translateFrom;
    }
    public void setTranslateFrom(String translateFrom) {
        this.translateFrom = translateFrom;
    }
    public String getTranslateTo() {
        return translateTo;
    }
    public void setTranslateTo(String translateTo) {
        this.translateTo = translateTo;
    }
    public Object getProjectId() {
        return projectId;
    }
    public void setProjectId(Object projectId) {
        this.projectId = projectId;
    }
    public Object getTemplateOrganisationId() {
        return templateOrganisationId;
    }
    public void setTemplateOrganisationId(Object templateOrganisationId) {
        this.templateOrganisationId = templateOrganisationId;
    }
    public String getLanguageId() {
        return languageId;
    }
    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }
    public Object getBvProductId() {
        return bvProductId;
    }
    public void setBvProductId(Object bvProductId) {
        this.bvProductId = bvProductId;
    }
    public String getBvProductName() {
        return bvProductName;
    }
    public void setBvProductName(String bvProductName) {
        this.bvProductName = bvProductName;
    }
    public Object getBvIncentivised() {
        return bvIncentivised;
    }
    public void setBvIncentivised(Object bvIncentivised) {
        this.bvIncentivised = bvIncentivised;
    }
    public Integer getUserResponsesCount() {
        return userResponsesCount;
    }
    public void setUserResponsesCount(Integer userResponsesCount) {
        this.userResponsesCount = userResponsesCount;
    }
    public Object getTargeting() {
        return targeting;
    }
    public void setTargeting(Object targeting) {
        this.targeting = targeting;
    }
    public Boolean getUserHasResponded() {
        return userHasResponded;
    }
    public void setUserHasResponded(Boolean userHasResponded) {
        this.userHasResponded = userHasResponded;
    }
    public String getIsWelcome() {
        return isWelcome;
    }
    public void setIsWelcome(String isWelcome) {
        this.isWelcome = isWelcome;
    }
    public Boolean getCanSubmitBulbshares() {
        return canSubmitBulbshares;
    }
    public void setCanSubmitBulbshares(Boolean canSubmitBulbshares) {
        this.canSubmitBulbshares = canSubmitBulbshares;
    }
    public Boolean getCanAnswerPoll() {
        return canAnswerPoll;
    }
    public void setCanAnswerPoll(Boolean canAnswerPoll) {
        this.canAnswerPoll = canAnswerPoll;
    }
    public Boolean getWasLikedByMe() {
        return wasLikedByMe;
    }
    public void setWasLikedByMe(Boolean wasLikedByMe) {
        this.wasLikedByMe = wasLikedByMe;
    }
    public Object getRewards() {
        return rewards;
    }
    public void setRewards(Object rewards) {
        this.rewards = rewards;
    }
    public Boolean getIsSyndicationBrief() {
        return isSyndicationBrief;
    }
    public void setIsSyndicationBrief(Boolean isSyndicationBrief) {
        this.isSyndicationBrief = isSyndicationBrief;
    }
    public ArrayList<String> getFeatures() {
        return features;
    }
    public void setFeatures(ArrayList<String> features) {
        this.features = features;
    }

}

