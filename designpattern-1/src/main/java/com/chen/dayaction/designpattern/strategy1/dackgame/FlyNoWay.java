package com.chen.dayaction.designpattern.strategy1.dackgame;

public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("不能飞行！");
    }
}
