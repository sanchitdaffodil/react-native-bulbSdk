package datamanager.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Bulbshare implements Serializable {

    @SerializedName("bulbshareref")
    @Expose
    private String bulbshareref;

    @SerializedName("user")
    @Expose
    private User user;

    @SerializedName("brief")
    @Expose
    private Briefs briefs;

    @SerializedName("picture")
    @Expose
    private String picture;

    @SerializedName("video")
    @Expose
    private String video;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("comment")
    @Expose
    private String comment;

    @SerializedName("comment_style")
    @Expose
    private CommentStyle commentStyle;

    @SerializedName("likes_count")
    @Expose
    private int likesCount;

    @SerializedName("comments_count")
    @Expose
    private int commentsCount;

    @SerializedName("is_shareable")
    @Expose
    private boolean isShereable;

    @SerializedName("submitted_on")
    @Expose
    private String submittedOn;

    @SerializedName("was_liked_by_me")
    @Expose
    private boolean wasLikedByMe;

    public String getBulbshareref() {
        return bulbshareref;
    }

    public void setBulbshareref(String bulbshareref) {
        this.bulbshareref = bulbshareref;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Briefs getBriefs() {
        return briefs;
    }

    public void setBriefs(Briefs briefs) {
        this.briefs = briefs;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public CommentStyle getCommentStyle() {
        return commentStyle;
    }

    public void setCommentStyle(CommentStyle commentStyle) {
        this.commentStyle = commentStyle;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public boolean isShereable() {
        return isShereable;
    }

    public void setShereable(boolean shereable) {
        isShereable = shereable;
    }

    public String getSubmittedOn() {
        return submittedOn;
    }

    public void setSubmittedOn(String submittedOn) {
        this.submittedOn = submittedOn;
    }

    public boolean isWasLikedByMe() {
        return wasLikedByMe;
    }

    public void setWasLikedByMe(boolean wasLikedByMe) {
        this.wasLikedByMe = wasLikedByMe;
    }
}
