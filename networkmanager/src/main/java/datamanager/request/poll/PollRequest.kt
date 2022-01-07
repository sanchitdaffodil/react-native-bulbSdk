package datamanager.request.poll

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class PollRequest(
    @SerializedName("args")
    var args: Args,
    @SerializedName("deviceref")
    var deviceRef: String,
    @SerializedName("app_id")
    var appId: String
) : Parcelable

@Parcelize
data class Args(
    @SerializedName("ref")
    var ref: String,
) : Parcelable