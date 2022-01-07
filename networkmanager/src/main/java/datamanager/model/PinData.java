package datamanager.model;

import android.graphics.Bitmap;
import android.graphics.PointF;

public class PinData {
    private String description;
    private Bitmap image;
    private PointF pointF;
    private int optionId;
    private String sentiment;
    public double relativeX;
    public double relativeY;
    public int optionid;

    public PinData(String description, String sentiment, Bitmap image, PointF pointF) {
        this.description = description;
        this.sentiment = sentiment;
        this.image = image;
        this.pointF = pointF;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public PointF getPointF() {
        return pointF;
    }

    public void setPointF(PointF pointF) {
        this.pointF = pointF;
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

}
