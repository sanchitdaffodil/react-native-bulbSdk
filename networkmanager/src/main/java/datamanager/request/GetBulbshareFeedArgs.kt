package datamanager.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class GetBulbshareFeedArgs(
    @SerializedName("privatebrandid")
    @Expose
    var privatebrandid : Int,

    @SerializedName("page")
    @Expose
    var page : Int
)