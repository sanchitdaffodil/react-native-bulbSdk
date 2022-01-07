package com.example.networkmanger.Rx;

import com.example.networkmanger.R;
import com.example.networkmanger.exception.ErrorResponse;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import com.example.networkmanger.network.NetworkConstants;
import com.example.networkmanger.exception.ApiException;
import com.example.networkmanger.exception.NoConnectivityException;

import java.net.ConnectException;

import io.reactivex.Observable;
import io.reactivex.functions.Function;
import retrofit2.HttpException;

public class ApiErrorHelper<T> {
    public Function<Throwable, Observable<? extends T>> getErrorParser() {
        return throwable -> {
            if (throwable instanceof NoConnectivityException) {
                return Observable.error(throwable);
            }

            ApiException exception = null;

            if (throwable instanceof HttpException) {
                String errorBody = ((HttpException) throwable).response().errorBody().string();

                ErrorResponse errorResponse = new Gson().fromJson(errorBody, ErrorResponse.class);

                return Observable.error(errorResponse);

            }

            ErrorResponse errorResponse = null;

            if (exception == null) {
                errorResponse = new ErrorResponse(599, "Something went wrong!");
            }

            return Observable.error(errorResponse);
        };
    }
}
