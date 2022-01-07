package datamanager.request

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import datamanager.request.poll.Args
import datamanager.request.poll.BulbshareByBriefArgs
import kotlinx.parcelize.Parcelize

@Parcelize
data class BulbsharesByBriefRequest(
    @SerializedName("args")
    var args: BulbsharesByBriefArgs,
    @SerializedName("deviceref")
    var deviceRef: String,
    @SerializedName("app_id")
    var appId: String
) : Parcelable

@Parcelize
data class BulbsharesByBriefArgs(
    @SerializedName("briefref")
    var briefRef: String,
    @SerializedName("count")
    var count: Int,
    @SerializedName("page")
    var page: Int,
    @SerializedName("sort_type")
    var sortType: Int,
) : Parcelable