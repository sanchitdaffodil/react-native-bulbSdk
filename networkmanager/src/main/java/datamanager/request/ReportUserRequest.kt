package datamanager.request

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ReportUserRequest (
    @SerializedName("args")
    var args : UserArgs?   = UserArgs(),
    @SerializedName("deviceref" )
    var deviceref : String? = null,
    @SerializedName("app_id"    )
    var appId: String? = null

):Parcelable

@Parcelize
data class UserArgs(
    @SerializedName("ref")
    var ref: String? = null,
    @SerializedName("reason" )
    var reason: String? = null
):Parcelable