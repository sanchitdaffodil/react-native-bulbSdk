package datamanager.request.poll

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class COnfirmUploadedBulbshareRequest(
    @SerializedName("args")
    var args: ConfirmBulbshareArgs,

    @SerializedName("deviceref")
    var deviceRef: String,

    @SerializedName("app_id")
    var appId: String
) : Parcelable

@Parcelize
data class ConfirmBulbshareArgs(

    @SerializedName("bulbshareref")
    var bulbshareref: String,

    @SerializedName("media_type")
    var media_type: String,

    @SerializedName("key")
    var key: String,

    @SerializedName("checksum")
    var checksum: String,

    ) : Parcelable
