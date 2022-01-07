package datamanager.request.brief;

import datamanager.request.BaseRequest;

public class BriefRequest extends BaseRequest {

    private BriefArgs args;

    public BriefArgs getArgs() {
        return args;
    }

    public void setArgs(BriefArgs args) {
        this.args = args;
    }
}
