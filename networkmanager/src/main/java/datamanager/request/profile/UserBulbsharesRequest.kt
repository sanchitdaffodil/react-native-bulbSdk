package datamanager.request.profile

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserBulbsharesRequest(
    @SerializedName("deviceref")
    val deviceRef: String,
    @SerializedName("app_id")
    val appId: String,
    @SerializedName("args")
    val args: UserBulbsharesArgs
) :Parcelable

@Parcelize
data class UserBulbsharesArgs(
    @SerializedName("userref")
    val userRef: String,
    @SerializedName("page")
    val page: Int,
    @SerializedName("count")
    val count: Int,
) : Parcelable