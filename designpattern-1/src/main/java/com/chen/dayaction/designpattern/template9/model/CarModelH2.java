package com.chen.dayaction.designpattern.template9.model;

public class CarModelH2 extends CarModel {
    protected void stop() {
        System.out.println("H2车辆模型暂停！");
    }

    @Override
    protected void alarm() {
        System.out.println("H2车辆模型鸣喇叭！");
    }

    @Override
    protected void start() {
        System.out.println("启动H2车辆模型...");
    }

}
