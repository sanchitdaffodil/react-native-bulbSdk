package datamanager.response;


import java.io.Serializable;

public class BulbshareUpload extends Bulbshare implements Serializable {
    public static String STATUS_INPROGRESS = "INPROGRESS";

    private String upload_status;
    private String upload_briefref;
    private String upload_bulbshareref;
    private Integer upload_progress;
    private String upload_image_path;
    private int foregraound_color;
    private int background_color;
    private Boolean upload_image_finished;
    private String upload_video_path;
    private Boolean upload_video_finished;
    private Boolean is_video_transcoding;

    public BulbshareUpload(String bulbshareref, String briefref, String image, String video, int foreground_color, int background_color) {
        this.upload_status = STATUS_INPROGRESS;
        this.upload_briefref = briefref;
        this.upload_bulbshareref = bulbshareref;
        this.upload_progress = -1;
        this.upload_image_path = image;
        this.upload_image_finished = false;
        this.foregraound_color = foreground_color;
        this.background_color = background_color;
        this.upload_video_path = video;
        this.upload_video_finished = false;
        this.is_video_transcoding = false;
    }

    public void setUploadStatus(String value) {
        this.upload_status = value;
    }
    public String getUploadStatus() {
        return this.upload_status;
    }

    public void setUploadBriefRef(String value) {
        this.upload_briefref = value;
    }
    public String getUploadBriefRef() {
        return this.upload_briefref;
    }

    public void setUploadBulbshareRef(String value) {
        this.upload_bulbshareref = value;
    }
    public String getUploadBulbshareRef() {
        return this.upload_bulbshareref;
    }

    public void setUploadProgress(Integer value) {
        this.upload_progress = value;
    }
    public Integer getUploadProgress() {
        return this.upload_progress;
    }

    public void setUploadImageUri(String value) {
        this.upload_image_path = value;
    }
    public String getUploadImageUri() {
        return this.upload_image_path;
    }
    public void setForegraoundColor(int value) {
        this.foregraound_color = value;
    }
    public int getForegraoundColor() {
        return this.foregraound_color;
    }
    public void setBackgroundColor(int value) {
        this.background_color = value;
    }
    public int getBackgroundColor() {
        return this.background_color;
    }

    public void setUploadImageFinished(Boolean value) {
        this.upload_image_finished = value;
    }
    public Boolean getUploadImageFinished() {
        return this.upload_image_finished;
    }

    public void setUploadVideoUri(String value) {
        this.upload_video_path = value;
    }
    public String getUploadVideoUri() {
        return this.upload_video_path;
    }

    public void setUploadVideoFinished(Boolean value) {
        this.upload_video_finished = value;
    }
    public Boolean getUploadVideoFinished() {
        return this.upload_video_finished;
    }

    public void setIsVideoTranscoding(Boolean value) {
        this.is_video_transcoding = value;
    }
    public Boolean getIsVideoTranscoding() {
        return this.is_video_transcoding;
    }
}
