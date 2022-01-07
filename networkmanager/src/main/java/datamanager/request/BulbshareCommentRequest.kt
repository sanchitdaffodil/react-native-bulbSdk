package datamanager.request

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class BulbshareCommentRequest (
    @SerializedName("args")
    val args:BsArgs? = null,

    @SerializedName("deviceref")
    val deviceref:String? = null,

    @SerializedName("app_id")
    val app_id:String? = null

        ):Parcelable

@Parcelize
data class BsArgs(
    @SerializedName("bulbshareref")
    val bulbshareref:String? = null
):Parcelable