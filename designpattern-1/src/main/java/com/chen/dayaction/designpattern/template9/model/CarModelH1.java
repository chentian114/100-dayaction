package com.chen.dayaction.designpattern.template9.model;

public class CarModelH1 extends CarModel {
    private boolean isAlarm = true;
    @Override
    protected void stop() {
        System.out.println("H1车辆模型暂停！");
    }

    @Override
    protected void alarm() {
        System.out.println("H1车辆模型鸣喇叭！");
    }

    @Override
    protected void start() {
        System.out.println("启动H1车辆模型...");
    }

    @Override
    public boolean isAlarm(){
        return isAlarm;
    }

    public void setAlarm(boolean isAlarm){
        this.isAlarm = isAlarm;
    }
}
