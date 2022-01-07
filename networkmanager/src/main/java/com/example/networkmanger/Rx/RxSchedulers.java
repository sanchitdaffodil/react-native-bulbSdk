package com.example.networkmanger.Rx;

import io.reactivex.Scheduler;


public interface RxSchedulers {

  Scheduler androidUI();

  Scheduler io();

  Scheduler computation();

  Scheduler immediate();
}