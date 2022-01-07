package datamanager.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

 public class BriefsResponse{
     @SerializedName("briefs")
     @Expose
     private ArrayList<Briefs> briefs = new ArrayList<Briefs>();
     @SerializedName("channels")
     @Expose
     private ArrayList<Channel> channels = new ArrayList<Channel>();
     @SerializedName("userRole")
     @Expose
     private Integer userRole;

     public ArrayList<Briefs> getBriefs() {
         return briefs;
     }
     public void setBriefs(ArrayList<Briefs> briefs) {
         this.briefs = briefs;
     }
     public ArrayList<Channel> getChannels() {
         return channels;
     }
     public void setChannels(ArrayList<Channel> channels) {
         this.channels = channels;
     }
     public Integer getUserRole() {
         return userRole;
     }
     public void setUserRole(Integer userRole) {
         this.userRole = userRole;
     }

     @Override
     public String toString() {
         return "BriefsResponse{" +
                 "briefs=" + briefs +
                 ", channels=" + channels +
                 ", userRole=" + userRole +
                 '}';
     }
 }






