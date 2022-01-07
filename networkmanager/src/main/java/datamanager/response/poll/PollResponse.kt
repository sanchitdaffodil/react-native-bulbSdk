package datamanager.response.poll

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import datamanager.response.PollLogic
import kotlinx.parcelize.Parcelize
import java.io.Serializable
import java.util.*

@Parcelize
data class PollResponse(
    @SerializedName("status")
    val status: String? = null,
    @SerializedName("code")
    val code: Int = 0,
    @SerializedName("data") val data: ArrayList<PollData>? = null) : Parcelable

@Parcelize
data class PollData(
    @SerializedName("pollitemid")
    var pollitemid: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("size")
    val size: Int = 0,
    @SerializedName("duration")
    @Expose
    val duration: String? = null,
    @SerializedName("collection")
    @Expose
    val collection: ArrayList<CollectionData>? = null,
    @SerializedName("logic")
    val logic: ArrayList<PollLogic>? = null,
    @SerializedName("kind")
    val kind: String? = null,
    @SerializedName("min_length")
    val minLength: Int = 0,
    @SerializedName("left_action")
    val leftAction: String,
    @SerializedName("right_action")
    val rightAction: String,
    @SerializedName("image_url")
    var image: String? = null,
    @SerializedName("hint")
    var hint: String? = null,
    @SerializedName("select_count")
    val selectCount: Int,
    @SerializedName("include_none")
    val includeNone: Boolean,
    @SerializedName("mediatype")
    var mediatype: String? = null,
    @SerializedName("comment_mandatory")
    val commentMandatory: Boolean,
    @SerializedName("comment_title")
    val commentTitle: String,
    @SerializedName("comment_description")
    val commentDescription: String,
    @SerializedName("randomise")
    val randomise: Boolean

) : Parcelable, Serializable

@Parcelize
data class Item(
    @SerializedName("value")
    var value: String? = null,
    @SerializedName("image")
    val image: String? = null,
    @SerializedName("overlay_text")
    val overlayText: String? = null
) : Parcelable

@Parcelize
data class CollectionData(
    @SerializedName("optionid")
    var optionId: Int = 0,
    @SerializedName("items")
    val items: ArrayList<Item>? = null,
    @SerializedName("image")
    val image: String? = null,
    @SerializedName("overlay_text")
    val overlayText: String? = null,
    @SerializedName("value")
    val value: String,
    @SerializedName("text")
    var text: String? = null,
    @SerializedName("link_text")
    val linkText: String,
    @SerializedName("link")
    val link: String
) : Parcelable, Serializable
