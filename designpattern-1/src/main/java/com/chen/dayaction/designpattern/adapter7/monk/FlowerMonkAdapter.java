package com.chen.dayaction.designpattern.adapter7.monk;

public abstract class FlowerMonkAdapter implements Monk {
    @Override
    public void vegetarian() {
        System.out.println("nothing...");
    }

    @Override
    public void chanting() {
        System.out.println("nothing...");
    }

    @Override
    public void meditation() {
        System.out.println("nothing...");
    }

    @Override
    public void bellRinger() {
        System.out.println("nothing...");
    }

    @Override
    public void kungfu() {
        System.out.println("nothing...");
    }
}
