package com.example.networkmanger.exception;

public class ApiException extends Throwable {

    private String mErrorCode;
    private int mMessageResId;

    public ApiException(String errorCode, int messageResId) {
        this.mErrorCode = errorCode;
        this.mMessageResId = messageResId;
    }


    public int getMessageResId(){
        return mMessageResId;
    }

    public void setMessageResId(int mMessageResId) {
        this.mMessageResId = mMessageResId;
    }

    public String getErrorCode() {
        return mErrorCode;
    }

    public void setErrorCode(String mErrorCode) {
        this.mErrorCode = mErrorCode;
    }
    
}