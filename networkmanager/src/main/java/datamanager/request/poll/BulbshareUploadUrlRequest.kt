package datamanager.request.poll

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class BulbshareUploadUrlRequest(
    @SerializedName("args")
    var args: BulbshareArgs,

    @SerializedName("deviceref")
    var deviceRef: String,

    @SerializedName("app_id")
    var appId: String
) : Parcelable

@Parcelize
data class BulbshareArgs(

    @SerializedName("briefref")
    var briefRef: String,


    @SerializedName("media_type")
    var mediaType: String,

    @SerializedName("media_ext")
    var mediaExt: String

) : Parcelable
