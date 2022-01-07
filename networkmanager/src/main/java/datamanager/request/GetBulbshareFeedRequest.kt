package datamanager.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class GetBulbshareFeedRequest (
    @field:Expose
    @field:SerializedName("args")
    var args: GetBulbshareFeedArgs,

    @field:Expose
    @field:SerializedName("deviceref")
    var deviceRef: String,

    @field:Expose
    @field:SerializedName("app_id")
    var appId: String
)