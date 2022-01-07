package datamanager.request

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class BlockUserRequest(

    @SerializedName("args")
    var args : BlockUserArgs?   = BlockUserArgs(),
    @SerializedName("deviceref" )
    var deviceref : String? = null,
    @SerializedName("app_id"    )
    var appId: String? = null
):Parcelable


@Parcelize
data class BlockUserArgs(
    @SerializedName("userref")
    var userref: String? = null,

): Parcelable




