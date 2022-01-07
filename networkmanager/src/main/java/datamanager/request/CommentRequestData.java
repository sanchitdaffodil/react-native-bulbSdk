package datamanager.request;

public class CommentRequestData extends LikeRequestData {

    private String comment;
    private String bcommentref;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getBcommentref() {
        return bcommentref;
    }

    public void setBcommentref(String bcommentref) {
        this.bcommentref = bcommentref;
    }
}
