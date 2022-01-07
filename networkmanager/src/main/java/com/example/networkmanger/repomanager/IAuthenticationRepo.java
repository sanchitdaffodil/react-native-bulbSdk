package com.example.networkmanger.repomanager;

import datamanager.request.AuthenticationRequest;
import datamanager.response.AuthenticationResponse;
import io.reactivex.Observable;

public interface IAuthenticationRepo {
    Observable<AuthenticationResponse> authenticateSdk(AuthenticationRequest req);
}
