package datamanager;

public interface Config{
    String FACEBOOK_SOCIAL_ACCOUNT = "facebook";
    String INSTAGRAM_SOCIAL_ACCOUNT = "instagram";
    String TWITTER_SOCIAL_ACCOUNT = "twitter";
    String YOUTUBE_SOCIAL_ACCOUNT = "youtube";
    //markup
     int MARKUP_MAX_PINS = 100;
     int MARKUP_MAX_DESCRIPTION_LENGHT = 5000;

     String PRODUCTION_FAQ_URL = "https://resources.bulbshare.com/faq/";
     String DEVELOPMENT_FAQ_URL = "https://resources.bulbshare.com/faq/";
     boolean DEBUGE_MODE = false; // development
     String BROADCAST_REQUEST_BULBSHARE_LIKE_CHANGED = "BULBSHARE_LIKE_CHANGED";
    int BULBSHARE_ACTIVITY_REQUEST_CODE = 202;
    String BROADCAST_REQUEST_UPLOAD = "BROADCAST_REQUEST_UPLOAD";
    String BROADCAST_REQUEST_UPLOAD_PICTURE = "BROADCAST_REQUEST_UPLOADPICTURE";
    int DELETED_BULBSHARE_CODE = 101;
    int BULBSHARE_UPDATE_CODE = 102;
    String BROADCAST_TWEET_UPLOAD_SERVICE_RESULT  = "aventaplus.si.bulbshare.broadcast_request.TWEET_UPLOAD_SERVICE_RESULT";
    int DEVICE_TYPE_CONST = 2;
    String BROADCAST_REQUEST_UPDATE = "BROADCAST_REQUEST_UPDATE";
    String BROADCAST_REQUEST_DELETE = "BROADCAST_REQUEST_DELETE";

}