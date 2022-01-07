package com.example.networkmanger.exception;

import java.io.IOException;

public class NoConnectivityException extends IOException {

    private final String msg;

    public NoConnectivityException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}