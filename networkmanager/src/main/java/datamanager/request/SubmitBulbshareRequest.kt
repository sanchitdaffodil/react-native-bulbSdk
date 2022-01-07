package datamanager.request

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class SubmitBulbshareRequest(
    @SerializedName("args")
    var args: SubmitBulbshareArgs,

    @SerializedName("deviceref")
    var deviceRef: String,

    @SerializedName("app_id")
    var appId: String
) : Parcelable

@Parcelize
data class SubmitBulbshareArgs(

    @SerializedName("briefref")
    var briefRef: String,


    @SerializedName("title")
    var title: String,

    @SerializedName("comment")
    var comment: String,

    @SerializedName("style")
    var style: Style,

    @SerializedName("device_info")
    var device_info: Device_info?


) : Parcelable

@Parcelize
data class Device_info(

    @SerializedName("type")
    var type: Int,

    @SerializedName("os")
    var os: String,

    @SerializedName("app_version")
    var app_version: String,

) : Parcelable


@Parcelize
data class Style(

    @SerializedName("bg_color")
    var bg_color: Bg_color,

    @SerializedName("font_color")
    var font_color: Font_color,

    @SerializedName("text_align")
    var text_align: String


) : Parcelable

@Parcelize
data class Bg_color(

    @SerializedName("R")
    var r: Int,

    @SerializedName("G")
    var g: Int,

    @SerializedName("B")
    var b: Int


) : Parcelable

@Parcelize
data class Font_color(

    @SerializedName("R")
    var r: Int,

    @SerializedName("G")
    var g: Int,

    @SerializedName("B")
    var b: Int


) : Parcelable