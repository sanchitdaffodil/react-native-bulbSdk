package datamanager.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import datamanager.response.profile.CommentStyle
import datamanager.response.profile.ProfileData
import kotlinx.parcelize.Parcelize

@Parcelize
data class BulbsharesByBriefResponse(
    @SerializedName("status")
    val status: String = "",
    @SerializedName("code")
    val code: Int = 0,
    @SerializedName("data")
    val data: ArrayList<BulbsharesByBrief>? = null
) : Parcelable

@Parcelize
data class BulbsharesByBrief(
    @SerializedName("bulbshareref")
    val bulbshareRef: String? = null,
    @SerializedName("user")
    var user: ProfileData? = null,
    @SerializedName("brief")
    var brief: Briefs? = null,
    @SerializedName("picture")
    var picture: String? = null,
    @SerializedName("video")
    var video: String? = null,
    @SerializedName("title")
    var title: String? = null,
    @SerializedName("comment")
    var comment: String? = null,
    @SerializedName("comment_style")
    val commentStyle: CommentStyle? = null,
    @SerializedName("likes_count")
    val likesCount: String? = null,
    @SerializedName("comments_count")
    val commentsCount: String? = null,
    @SerializedName("submitted_on")
    val submittedOn: String? = null,
    @SerializedName("is_shareable")
    val isShareable: String? = null,
    @SerializedName("was_liked_by_me")
    val wasLikedByMe: String? = null,
) : Parcelable


