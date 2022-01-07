package datamanager.response.poll

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class BulbshareUploadUrlResponse(

    @SerializedName("status")
    val status: String? = null,

    @SerializedName("code")
    val code: Int = 0,

    @SerializedName("data")
    val data: AWSS3UploadCredentials? = null

) : Parcelable

@Parcelize
data class AWSS3UploadCredentials(
    @SerializedName("item")
    val item: String? = null,

    @SerializedName("brief")
    val brief: String? = null,

    @SerializedName("key")
    val key: String? = null,

    @SerializedName("url")
    val url: String? = null,

    @SerializedName("videotn_key")
    val videoTnKey: String? = null,

    @SerializedName("videotn_url")
    val videoTnUrl: String? = null

) : Parcelable
