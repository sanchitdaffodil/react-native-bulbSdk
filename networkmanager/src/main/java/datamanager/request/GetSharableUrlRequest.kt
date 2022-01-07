package datamanager.request

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import datamanager.request.poll.Args
import kotlinx.parcelize.Parcelize

@Parcelize
data class GetSharableUrlRequest(
    @SerializedName("args")
    var args: SharableUrlArgs,
    @SerializedName("deviceref")
    var deviceRef: String,
    @SerializedName("app_id")
    var appId: String
) : Parcelable

@Parcelize
data class SharableUrlArgs(
    @SerializedName("ref")
    var ref: String,
    @SerializedName("device_info")
    var deviceInfo: DeviceInfo,
) : Parcelable

@Parcelize
data class DeviceInfo(
    @SerializedName("type")
    var type: Int,
    @SerializedName("os")
    var os: String,
    @SerializedName("app_version")
    var app_version: String,
) : Parcelable