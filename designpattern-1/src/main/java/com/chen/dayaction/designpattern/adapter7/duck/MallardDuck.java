package com.chen.dayaction.designpattern.adapter7.duck;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("duck quack,quack");
    }

    @Override
    public void fly() {
        System.out.println("duck flying!");
    }
}
