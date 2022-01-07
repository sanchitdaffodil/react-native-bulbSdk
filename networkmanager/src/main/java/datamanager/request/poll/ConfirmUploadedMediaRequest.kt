package datamanager.request.poll

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ConfirmUploadedMediaRequest (

    @SerializedName("args")
    var args: ConfirmMediaArgs,

    @SerializedName("deviceref")
    var deviceRef: String,

    @SerializedName("app_id")
    var appId: String

) : Parcelable

@Parcelize
data class ConfirmMediaArgs(

    @SerializedName("pollitemid")
    var pollItemId: Int,

    @SerializedName("key")
    var key: String,

    @SerializedName("checksum")
    var checksum: String,

) : Parcelable