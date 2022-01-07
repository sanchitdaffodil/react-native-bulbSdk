package datamanager.response.profile

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import java.util.ArrayList

@Parcelize
data class UserBrandsResponse(
    @SerializedName("status")
    val status: String = "",
    @SerializedName("code")
    val code: Int = 0,
    @SerializedName("data")
    val data: ArrayList<UserBrand>? = null
) : Parcelable

@Parcelize
data class UserBrand(
    @SerializedName("brandid")
    val brandId: String? = null,
    @SerializedName("brandref")
    val brandRef: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("logo")
    val logo: String? = null,
    @SerializedName("likes_count")
    val likesCount: Int = 0,
    @SerializedName("followers_count")
    val followersCount: Int = 0,
    @SerializedName("is_discoverable")
    val isDiscoverable: Boolean = false,
    @SerializedName("discover_title")
    val discoverTitle: String = "",
    @SerializedName("discover_about")
    val discoverAbout: String = "",
    @SerializedName("discover_country")
    val discoverCountry: String? = "",
    @SerializedName("is_private")
    val isPrivate: Boolean = false,
) : Parcelable