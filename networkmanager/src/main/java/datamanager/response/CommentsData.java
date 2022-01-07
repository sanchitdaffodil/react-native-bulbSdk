package datamanager.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CommentsData implements Serializable {

    @SerializedName("bcommentref")
    @Expose
    private String bcommentref;
    @SerializedName("commentref")
    @Expose
    private String commentref;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("likes_count")
    @Expose
    private Integer likesCount;
    @SerializedName("submitted_on")
    @Expose
    private String submittedOn;
    @SerializedName("is_blocked_by_me")
    @Expose
    private String isBlockedByMe;

    public String getBcommentref() {
        return bcommentref;
    }

    public void setBcommentref(String bcommentref) {
        this.bcommentref = bcommentref;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    public String getSubmittedOn() {
        return submittedOn;
    }

    public void setSubmittedOn(String submittedOn) {
        this.submittedOn = submittedOn;
    }

    public String getIsBlockedByMe() {
        return isBlockedByMe;
    }

    public void setIsBlockedByMe(String isBlockedByMe) {
        this.isBlockedByMe = isBlockedByMe;
    }

    public String getCommentref() {
        return commentref;
    }

    public void setCommentref(String commentref) {
        this.commentref = commentref;
    }
}