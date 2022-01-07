package datamanager.response.rewards

import android.os.Parcelable
import com.google.android.gms.common.internal.Objects
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class RewardsResponse(
    @SerializedName("status")
    val status: String? = null,

    @SerializedName("code")
    val code: Int = 0,

    @SerializedName("data")
    val data: ArrayList<RewardData>? = null
) : Parcelable

@Parcelize
data class RewardData(
    @SerializedName("rewardid")
    val rewardid: Int? = null,

    @SerializedName("briefref")
    val briefref: String? = null,

    @SerializedName("brand")
    val brand: Brand? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("cover_photo")
    val cover_photo: String? = null,

    @SerializedName("cover_video_mobile")
    val cover_video_mobile: String? = null,

    @SerializedName("cover_video_web")
    val cover_video_web: String? = null,

    @SerializedName("banner_image")
    val banner_image: String? = null,

    @SerializedName("likes_count")
    val likes_count: Int? = null,

    @SerializedName("bulbshares_count")
    val bulbshares_count: Int? = null,

    @SerializedName("comments_count")
    val comments_count: Int? = null,

    @SerializedName("is_private")
    val is_private: Boolean?= null,

    @SerializedName("can_submit_bulbshares")
    val can_submit_bulbshares:Boolean? = null,

    @SerializedName("can_answer_poll")
    val can_answer_poll: Boolean?=null,

    @SerializedName("reward_image")
    val reward_image: String? = null,

    @SerializedName("reward_text")
    val reward_text: String?= null,

    @SerializedName("rewarded_on")
    val rewarded_on: String? = null,

    @SerializedName("alt_reward")
    val alt_reward: AltReward?=null,

    @SerializedName("alt_allocation")
    val alt_allocation:AltAllocation? = null

): Parcelable

@Parcelize
data class Brand(

    @SerializedName("brandid")
    val brandid: Int? = null,

   @SerializedName("name")
   val name: String? = null,

    @SerializedName("logo")
    val logo: String? = null,

    @SerializedName("likes_count")
    val likes_count: Int? = null,

    @SerializedName("followers_count")
    val followers_count: Int? = null,

    @SerializedName("is_private")
    val is_private: Boolean? = null
): Parcelable

@Parcelize
data class AltReward(

    @SerializedName("organisation_id")
    val organisation_id: String? = null,

    @SerializedName("reward_id")
    val reward_id: String? = null,

    @SerializedName("reward_type_id")
    val reward_type_id: String? = null,

    @SerializedName("reward_voucher_type_id")
    val reward_voucher_type_id: String?=null,

    @SerializedName("brand_id")
    val brand_id: String? = null,

    @SerializedName("title")
    val title: String? = null,

    @SerializedName("description")
    val description: String? = null,

    @SerializedName("approval_required")
    val  approval_required: String? = null,

    @SerializedName("no_of_briefs_required")
    val no_of_briefs_required: String? = null,

    @SerializedName("specific_briefs_required")
    val specific_briefs_required: String? = null,

    @SerializedName("units")
    val units: String? = null,

    @SerializedName("max_units")
    val max_units: String?=null,

    @SerializedName("is_activated")
    val is_activated: String? = null,

    @SerializedName("created")
    val  created: String? = null,

    @SerializedName("updated")
    val updated: String? = null,
):Parcelable

@Parcelize
data class AltAllocation(

    @SerializedName("reward_type_id")
    val reward_type_id: String? = null,

    @SerializedName("organisation_id")
    val organisation_id: String? = null,

    @SerializedName("reward_type")
    val reward_type: String? = null,

    @SerializedName("reward")
    val reward: String? = null,

    @SerializedName("email")
    val email: String? = null,

    @SerializedName("reward_id")
    val reward_id: String? = null,

    @SerializedName("reward_allocation_id")
    val reward_allocation_id: String? = null,

    @SerializedName("user_id")
    val user_id: String? = null,

    @SerializedName("eligible")
    val eligible: String? = null,

    @SerializedName("response_count")
    val response_count: String? = null,

    @SerializedName("status")
    val status: String? = null,

    @SerializedName("instructions")
    val instructions: String? = null

):Parcelable





