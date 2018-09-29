package com.chen.dayaction.designpattern.command6.remote;

public class Light implements Receiver {

    @Override
    public void on() {
        System.out.println("打开电灯！");
    }

    @Override
    public void off() {
        System.out.println("关闭电灯！");
    }
}
