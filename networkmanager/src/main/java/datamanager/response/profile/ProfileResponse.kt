package datamanager.response.profile

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import org.json.JSONObject
import java.util.ArrayList

@Parcelize
data class ProfileResponse(
    @SerializedName("status")
    val status: String = "",
    @SerializedName("code")
    val code: Int = 0,
    @SerializedName("data")
    var data: ProfileData? = null
) : Parcelable

@Parcelize
data class ProfileData(
    @SerializedName("userref")
    val userRef: String? = null,
    @SerializedName("email")
    val email: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("first_name")
    val firstName: String? = null,
    @SerializedName("last_name")
    val lastName: String? = null,
    @SerializedName("display_name")
    val displayName: String? = null,
    @SerializedName("referral_code")
    val referralCode: String? = null,
    @SerializedName("referraluserid")
    val referralUserId: String? = null,
    @SerializedName("avatar")
    var avatar: String? = null,
    @SerializedName("custom_background")
    val customBackground: String? = null,
    @SerializedName("gender")
    val gender: String? = null,
    @SerializedName("birthday")
    val birthday: String? = null,
    @SerializedName("phone_number")
    val phoneNumber: String? = null,
    @SerializedName("country_id")
    val countryId: Int = 0,
    @SerializedName("country_name")
    val countryName: String? = null,
    @SerializedName("city_id")
    val cityId: Int = 0,
    @SerializedName("city_name")
    val cityName: String? = null,
    @SerializedName("bio")
    val bio: String? = "",
    @SerializedName("likes_count")
    val likesCount: Int = 0,
    @SerializedName("followers_count")
    val followersCount: Int = 0,
    @SerializedName("bulbshares_count")
    val bulbsharesCount: Int = 0,
    @SerializedName("follow_friends_count")
    val followFriendsCount: Int = 0,
    @SerializedName("follow_brands_count")
    val followBrandsCount: Int = 0,
    @SerializedName("facebook_id")
    val facebookId: String? = null,
    @SerializedName("apple_id")
    val appleId: String? = null,
    @SerializedName("is_verified")
    val isVerified: Boolean? = null,
    @SerializedName("status")
    val status: String = "0",
    @SerializedName("is_email_verified")
    val isEmailVerified: Boolean? = null,
    @SerializedName("last_connection")
    val lastConnection: String? = null,
    @SerializedName("last_modified")
    val lastModified: String? = null,
    @SerializedName("registered_on")
    val registeredOn: String? = null,
    @SerializedName("deactivated_reason")
    val deactivatedReason: String? = null,
    @SerializedName("followed_brands")
    val followedBrandsList: ArrayList<FollowedBrand?>? = null,
    @SerializedName("followed_friends")
    val followedFriendsList: ArrayList<FollowedFriend?>? = null,
    @SerializedName("submitted_bulbshares")
    val submittedBulbshares: ArrayList<SubmittedBulbshare?>? = null,
    @SerializedName("social_accounts")
    var socialAccounts: SocialAccounts? = null,
    @SerializedName("rewards_count")
    val rewardsCount: Int = 0,
    @SerializedName("user_role")
    val userRole: Int = 0,
) : Parcelable

@Parcelize
data class FollowedBrand(
    @SerializedName("brandid")
    val brandId: Int = 0,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("logo")
    val logo: String? = null,
    @SerializedName("likes_count")
    val likesCount: Int = 0,
    @SerializedName("followers_count")
    val followersCount: Int = 0,
    @SerializedName("is_private")
    val isPrivate: Boolean? = null,
    @SerializedName("is_removed")
    val isRemoved: Boolean? = null,
) : Parcelable

@Parcelize
data class FollowedFriend(
    @SerializedName("userref")
    val userRef: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("display_name")
    val displayName: String? = null,
    @SerializedName("referral_code")
    val referralCode: String? = null,
    @SerializedName("referraluserid")
    val referralUserId: String? = null,
    @SerializedName("avatar")
    val avatar: String? = null,
    @SerializedName("custom_background")
    val customBackground: String? = null,
    @SerializedName("likes_count")
    val likesCount: Int = 0,
    @SerializedName("followers_count")
    val followersCount: Int = 0,
    @SerializedName("follow_friends_count")
    val followFriendsCount: Int = 0,
    @SerializedName("follow_brands_count")
    val followBrandsCount: Int = 0,
    @SerializedName("apple_id")
    val appleId: String? = null,
    @SerializedName("status")
    val status: String = "0",
    @SerializedName("is_email_verified")
    val isEmailVerified: Boolean? = null,
    @SerializedName("last_connection")
    val lastConnection: String? = null,
    @SerializedName("deactivated_reason")
    val deactivatedReason: String? = null,
    @SerializedName("facebookid")
    val facebookId: String = ""
) : Parcelable

@Parcelize
data class SubmittedBulbshare(
    @SerializedName("bulbshareref")
    val bulbshareRef: String? = null,
    @SerializedName("picture")
    val picture: String? = null,
    @SerializedName("title")
    val title: String? = null,
) : Parcelable

@Parcelize
data class SocialAccounts(
    @SerializedName("facebook")
    var facebook: SocialAccountData? = null,
    @SerializedName("twitter")
    var twitter: SocialAccountData? = null,
    @SerializedName("instagram")
    var instagram: SocialAccountData? = null,
    @SerializedName("youtube")
    var youtube: SocialAccountData? = null,
) : Parcelable

@Parcelize
data class SocialAccountData(
    @SerializedName("useraccountid")
    var userAccountId: Int? = null,
    @SerializedName("account_id")
    var accountId: String? = null,
    @SerializedName("account_name")
    var accountName: String? = null,
) : Parcelable

