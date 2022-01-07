package datamanager.request

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class BulbshareGetLikesRequest(

    @SerializedName("args")
    var args: GetLikeArgs? = GetLikeArgs(),

    @SerializedName("deviceref")
    var deviceref: String? = null,

    @SerializedName("app_id")
    var appId: String? = null

):Parcelable

@Parcelize
data class GetLikeArgs(
    @SerializedName("bulbshareref")
    var bulbshareref : String?  = null,

    @SerializedName("page")
    var page: Int? = null,

    @SerializedName("count")
    var count: Int? = null,

    @SerializedName("with_my_status")
    var withMyStatus: Boolean? = null


):Parcelable