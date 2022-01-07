package datamanager.request.poll

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MediaUploadUrlRequest(

    @SerializedName("args")
    var args: MediaArgs,

    @SerializedName("deviceref")
    var deviceRef: String,

    @SerializedName("app_id")
    var appId: String

) : Parcelable

@Parcelize
data class MediaArgs(

    @SerializedName("briefref")
    var briefRef: String,

    @SerializedName("pollitemid")
    var pollItemId: Int,

    @SerializedName("media_type")
    var mediaType: String,

    @SerializedName("media_ext")
    var mediaExt: String

) : Parcelable




