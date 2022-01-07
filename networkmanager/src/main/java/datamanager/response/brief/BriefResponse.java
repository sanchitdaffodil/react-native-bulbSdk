package datamanager.response.brief;

import datamanager.response.BaseResponse;
import datamanager.response.Briefs;


public class BriefResponse extends BaseResponse {

    private Briefs data;

    public Briefs getData() {
        return data;
    }

    public void setData(Briefs data) {
        this.data = data;
    }
}
