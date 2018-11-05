package com.chen.dayaction.designpattern.template9.model;

public abstract class CarModel {
    //跑起来
    public void run(){
        start();
        if(isAlarm()){
            alarm();
        }
        stop();
    }

    //暂停
    protected abstract void stop();
    //鸣笛
    protected abstract void alarm();
    //启动
    protected abstract void start();

    protected boolean isAlarm(){
        return true;
    }
}
