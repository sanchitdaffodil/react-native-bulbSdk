package datamanager.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.HashMap;

import datamanager.Config;

public class User implements Serializable {

    public HashMap<String, SocialAccount> socialAccounts;

    @SerializedName("userref")
    @Expose
    private String userref;
    @SerializedName("email")
    @Expose
    private String email;
    private String gender;
    private String birthday;
    private int userRole;
    private boolean isFollowedByMe;
    private boolean wasLikedByMe;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("referral_code")
    @Expose
    private String referralCode;
    @SerializedName("referraluserid")
    @Expose
    private Object referraluserid;
    @SerializedName("avatar")
    @Expose
    private String avatar ="";
    @SerializedName("custom_background")
    @Expose
    private String customBackground;
    @SerializedName("ethnicity")
    @Expose
    private String ethnicity;
    @SerializedName("phone_number")
    @Expose
    private String phoneNumber;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("city_id")
    @Expose
    private Integer cityId;
    @SerializedName("city_name")
    @Expose
    private String cityName;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;
    @SerializedName("followers_count")
    @Expose
    private Integer followersCount;
    @SerializedName("bulbshares_count")
    @Expose
    private Integer bulbsharesCount;
    @SerializedName("follow_friends_count")
    @Expose
    private Integer followFriendsCount;
    @SerializedName("follow_brands_count")
    @Expose
    private Integer followBrandsCount;
    @SerializedName("facebook_friends_count")
    @Expose
    private Integer facebookFriendsCount;
    @SerializedName("apple_id")
    @Expose
    private String appleId;
    @SerializedName("google_plusfollowers_count")
    @Expose
    private Integer googlePlusfollowersCount;
    @SerializedName("twitter_id")
    @Expose
    private String twitterId;
    @SerializedName("twitter_followers_count")
    @Expose
    private Integer twitterFollowersCount;
    @SerializedName("instagram_id")
    @Expose
    private String instagramId;
    @SerializedName("instagram_followers_count")
    @Expose
    private Integer instagramFollowersCount;
    @SerializedName("youtube_id")
    @Expose
    private String youtubeId;
    @SerializedName("youtube_subscribers_count")
    @Expose
    private Integer youtubeSubscribersCount;
    @SerializedName("social_reach")
    @Expose
    private Integer socialReach;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("is_email_verified")
    @Expose
    private String isEmailVerified;
    @SerializedName("last_connection")
    @Expose
    private String lastConnection;
    @SerializedName("deactivated_reason")
    @Expose
    private Object deactivatedReason;

    public String getUserref() {
        return userref;
    }

    public void setUserref(String userref) {
        this.userref = userref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public Object getReferraluserid() {
        return referraluserid;
    }

    public void setReferraluserid(Object referraluserid) {
        this.referraluserid = referraluserid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCustomBackground() {
        return customBackground;
    }

    public void setCustomBackground(String customBackground) {
        this.customBackground = customBackground;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
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

    public Integer getBulbsharesCount() {
        return bulbsharesCount;
    }

    public void setBulbsharesCount(Integer bulbsharesCount) {
        this.bulbsharesCount = bulbsharesCount;
    }

    public Integer getFollowFriendsCount() {
        return followFriendsCount;
    }

    public void setFollowFriendsCount(Integer followFriendsCount) {
        this.followFriendsCount = followFriendsCount;
    }

    public Integer getFollowBrandsCount() {
        return followBrandsCount;
    }

    public void setFollowBrandsCount(Integer followBrandsCount) {
        this.followBrandsCount = followBrandsCount;
    }

    public Integer getFacebookFriendsCount() {
        return facebookFriendsCount;
    }

    public void setFacebookFriendsCount(Integer facebookFriendsCount) {
        this.facebookFriendsCount = facebookFriendsCount;
    }

    public String getAppleId() {
        return appleId;
    }

    public void setAppleId(String appleId) {
        this.appleId = appleId;
    }

    public Integer getGooglePlusfollowersCount() {
        return googlePlusfollowersCount;
    }

    public void setGooglePlusfollowersCount(Integer googlePlusfollowersCount) {
        this.googlePlusfollowersCount = googlePlusfollowersCount;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public Integer getTwitterFollowersCount() {
        return twitterFollowersCount;
    }

    public void setTwitterFollowersCount(Integer twitterFollowersCount) {
        this.twitterFollowersCount = twitterFollowersCount;
    }

    public String getInstagramId() {
        return instagramId;
    }

    public void setInstagramId(String instagramId) {
        this.instagramId = instagramId;
    }

    public Integer getInstagramFollowersCount() {
        return instagramFollowersCount;
    }

    public void setInstagramFollowersCount(Integer instagramFollowersCount) {
        this.instagramFollowersCount = instagramFollowersCount;
    }

    public String getYoutubeId() {
        return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public Integer getYoutubeSubscribersCount() {
        return youtubeSubscribersCount;
    }

    public void setYoutubeSubscribersCount(Integer youtubeSubscribersCount) {
        this.youtubeSubscribersCount = youtubeSubscribersCount;
    }

    public Integer getSocialReach() {
        return socialReach;
    }

    public void setSocialReach(Integer socialReach) {
        this.socialReach = socialReach;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsEmailVerified() {
        return isEmailVerified;
    }

    public void setIsEmailVerified(String isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
    }

    public String getLastConnection() {
        return lastConnection;
    }

    public void setLastConnection(String lastConnection) {
        this.lastConnection = lastConnection;
    }

    public Object getDeactivatedReason() {
        return deactivatedReason;
    }

    public void setDeactivatedReason(Object deactivatedReason) {
        this.deactivatedReason = deactivatedReason;
    }

    public User() {
    }

    public User(JSONObject JSONUser) {
        try {
            if (JSONUser.has("userref")) {
                setUserref(JSONUser.getString("userref"));
            }
            if (JSONUser.has("name")) {
                setName(JSONUser.getString("name"));
            }
            if (JSONUser.has("display_name")) {
                setDisplayName(JSONUser.getString("display_name"));
            }
            if (JSONUser.has("email")) {
                setEmail(JSONUser.getString("email"));
            }
            if (JSONUser.has("avatar")) {
                setAvatar(JSONUser.getString("avatar"));
            }
            if (JSONUser.has("gender")) {
                setGender(JSONUser.getString("gender"));
            }
            if (JSONUser.has("birthday")) {
                setBirthday(JSONUser.getString("birthday"));
            }
            if (JSONUser.has("country_name")) {
                setCountryName(JSONUser.getString("country_name"));
            }
            if (JSONUser.has("city_name")) {
                setCityName(JSONUser.getString("city_name"));
            }
            if (JSONUser.has("bio")) {
                setBio(JSONUser.getString("bio"));
            }
            if (JSONUser.has("likes_count")) {
                setLikesCount(JSONUser.getInt("likes_count"));
            }
            if (JSONUser.has("followers_count")) {
                setFollowersCount(JSONUser.getInt("followers_count"));
            }
            if (JSONUser.has("follow_friends_count")) {
                setFollowFriendsCount(JSONUser.getInt("follow_friends_count"));
            }
            if (JSONUser.has("follow_brands_count")) {
                setFollowBrandsCount(JSONUser.getInt("follow_brands_count"));
            }
            if (JSONUser.has("is_followed_by_me")) {
                setFollowedByMe(JSONUser.getBoolean("is_followed_by_me"));
            }
            if (JSONUser.has("was_liked_by_me")) {
                setWasLikedByMe(JSONUser.getBoolean("was_liked_by_me"));
            }
            if (JSONUser.has("bulbshares_count")) {
                setBulbsharesCount(JSONUser.getInt("bulbshares_count"));
            }
            if (JSONUser.has("user_role")) {
                setUserRole(JSONUser.getInt("user_role"));
            }

            if (JSONUser.has("social_accounts")) {
                JSONObject socialNetworksArray = JSONUser.getJSONObject("social_accounts");
                HashMap<String, SocialAccount> socialAccounts = new HashMap<>();
                if (socialNetworksArray.has("facebook")) {
                    if (!socialNetworksArray.isNull("facebook")) {
                        JSONObject socialAccountJsonObject = (JSONObject) socialNetworksArray.get("facebook");
                        SocialAccount socialAccount = new SocialAccount();
                        socialAccount.useraccountid = socialAccountJsonObject.getString("useraccountid");
                        socialAccount.accountId = socialAccountJsonObject.getString("account_id");
                        socialAccount.accountName = socialAccountJsonObject.getString("account_name");
                        socialAccounts.put(Config.FACEBOOK_SOCIAL_ACCOUNT, socialAccount);
                    } else {
                        socialAccounts.put(Config.FACEBOOK_SOCIAL_ACCOUNT, null);
                    }
                }
                if (socialNetworksArray.has("instagram")) {
                    if (!socialNetworksArray.isNull("instagram")) {
                        JSONObject socialAccountJsonObject = (JSONObject) socialNetworksArray.get("instagram");
                        SocialAccount socialAccount = new SocialAccount();
                        socialAccount.useraccountid = socialAccountJsonObject.getString("useraccountid");
                        socialAccount.accountId = socialAccountJsonObject.getString("account_id");
                        socialAccount.accountName = socialAccountJsonObject.getString("account_name");
                        socialAccounts.put(Config.INSTAGRAM_SOCIAL_ACCOUNT, socialAccount);
                    } else {
                        socialAccounts.put(Config.INSTAGRAM_SOCIAL_ACCOUNT, null);
                    }
                }
                if (socialNetworksArray.has("twitter")) {
                    if (!socialNetworksArray.isNull("twitter")) {
                        JSONObject socialAccountJsonObject = (JSONObject) socialNetworksArray.get("twitter");
                        SocialAccount socialAccount = new SocialAccount();
                        socialAccount.useraccountid = socialAccountJsonObject.getString("useraccountid");
                        socialAccount.accountId = socialAccountJsonObject.getString("account_id");
                        socialAccount.accountName = socialAccountJsonObject.getString("account_name");
                        socialAccounts.put(Config.TWITTER_SOCIAL_ACCOUNT, socialAccount);
                    } else {
                        socialAccounts.put(Config.TWITTER_SOCIAL_ACCOUNT, null);
                    }
                }
                if (socialNetworksArray.has("youtube")) {
                    if (!socialNetworksArray.isNull("youtube")) {
                        JSONObject socialAccountJsonObject = (JSONObject) socialNetworksArray.get("youtube");
                        SocialAccount socialAccount = new SocialAccount();
                        socialAccount.useraccountid = socialAccountJsonObject.getString("useraccountid");
                        socialAccount.accountId = socialAccountJsonObject.getString("account_id");
                        socialAccount.accountName = socialAccountJsonObject.getString("account_name");
                        String channel_id = socialAccountJsonObject.optString("channel_id");
                        if (channel_id != null) {
                            socialAccount.data = new JSONObject();
                            socialAccount.data.put("channel_id", channel_id);
                        }
                        socialAccounts.put(Config.YOUTUBE_SOCIAL_ACCOUNT, socialAccount);
                    } else {
                        socialAccounts.put(Config.YOUTUBE_SOCIAL_ACCOUNT, null);
                    }
                }
                this.socialAccounts = socialAccounts;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public boolean isFollowedByMe() {
        return isFollowedByMe;
    }

    public void setFollowedByMe(boolean followedByMe) {
        isFollowedByMe = followedByMe;
    }

    public boolean isWasLikedByMe() {
        return wasLikedByMe;
    }

    public void setWasLikedByMe(boolean wasLikedByMe) {
        this.wasLikedByMe = wasLikedByMe;
    }
}