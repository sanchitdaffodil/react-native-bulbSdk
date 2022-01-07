package com.example.networkmanger.repomanager;

import com.example.networkmanger.Rx.ApiErrorHelper;
import com.example.networkmanger.Rx.AppRxSchedulers;
import com.example.networkmanger.network.NetworkManager;

import datamanager.request.AuthenticationRequest;
import datamanager.response.AuthenticationResponse;
import io.reactivex.Observable;

public class AuthenticationRepoImpl implements IAuthenticationRepo {

    @Override
    public Observable<AuthenticationResponse> authenticateSdk(AuthenticationRequest req) {
        return NetworkManager.getApiClient().authenticate(req)
                .compose(new AppRxSchedulers().applySchedulers())
                .onErrorResumeNext(new ApiErrorHelper<AuthenticationResponse>().getErrorParser());
    }
}