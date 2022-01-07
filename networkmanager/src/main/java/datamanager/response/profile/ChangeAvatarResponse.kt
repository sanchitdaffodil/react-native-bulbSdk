package datamanager.response.profile

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ChangeAvatarResponse(
    @SerializedName("status")
    val status: String = "",
    @SerializedName("code")
    val code: Int = 0
) : Parcelable

@Parcelize
data class MediaCaptureItem(
    val itemId: String? = null,
    val responseId: Long = 0,
    val briefRef: String? = null,
    val pollItemId: Int = 0,
    val filePath: String? = null,
    var fileUrl: String? = null,
    val uploadUrl: String? = null,
    val filePathTn: String? = null,
    val fileUrlTn: String? = null,
    val uploadUrlTn: String? = null,
    val mediaType: String? = null,
    val checksum: String? = null,
    val picked: Boolean = false,
    var resampledFileUrl: String? = null
) : Parcelable