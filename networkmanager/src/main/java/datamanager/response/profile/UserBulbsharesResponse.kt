package datamanager.response.profile

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import datamanager.response.Briefs
import kotlinx.parcelize.Parcelize
import java.util.ArrayList

@Parcelize
data class UserBulbsharesResponse(
    @SerializedName("status")
    val status: String = "",
    @SerializedName("code")
    val code: Int = 0,
    @SerializedName("data")
    val data: ArrayList<BulbshareByUser>? = null
) : Parcelable

@Parcelize
data class BulbshareByUser(
    @SerializedName("bulbshareref")
    val bulbshareRef: String? = null,
    @SerializedName("picture")
    val picture: String? = "",
    @SerializedName("video")
    val video: String? = "",
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("comment")
    val comment: String? = "",
    @SerializedName("likes_count")
    val likesCount: String? = null,
    @SerializedName("comments_count")
    val commentsCount: String? = null,
    @SerializedName("submitted_on")
    val submittedOn: String? = null,
    @SerializedName("is_shareable")
    val isShareable: String? = null,
    @SerializedName("brief")
    val brief: Briefs? = null,
    @SerializedName("comment_style")
    val commentStyle: CommentStyle? = null
) : Parcelable

@Parcelize
data class CommentStyle(
    @SerializedName("bg_color")
    val bgColor: CommentColor? = null,
    @SerializedName("font_color")
    val fontColor: CommentColor? = null,
    @SerializedName("text_align")
    val textAlign: String? = null
) : Parcelable

@Parcelize
data class CommentColor(
    @SerializedName("R")
    val colorR: Int,
    @SerializedName("G")
    val colorG: Int,
    @SerializedName("B")
    val colorB: Int
) : Parcelable