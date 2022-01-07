package datamanager.response;

import org.json.JSONObject;

import java.io.Serializable;

public class SocialAccount implements Serializable {

    public String useraccountid;
    public String accountId;
    public String accountName;
    public int type;
    public JSONObject authentication;
    public JSONObject data;

}
