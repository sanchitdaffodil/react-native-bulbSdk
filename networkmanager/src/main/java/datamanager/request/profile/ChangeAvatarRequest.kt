package datamanager.request.profile

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ChangeAvatarRequest(
    @SerializedName("deviceref")
    val deviceRef: String,
    @SerializedName("app_id")
    val appId: String,
    @SerializedName("args")
    val args: ChangeAvatarArgs
) : Parcelable

@Parcelize
data class ChangeAvatarArgs(
    @SerializedName("type")
    val type: String,
    @SerializedName("data")
    val data: String?
) : Parcelable
