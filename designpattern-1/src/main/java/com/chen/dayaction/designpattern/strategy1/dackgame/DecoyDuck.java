package com.chen.dayaction.designpattern.strategy1.dackgame;

public class DecoyDuck extends Duck {
    public DecoyDuck(FlyBehavior flyBehavior,QuackBehavior quackBehavior){
        super.setFlyBehavior(flyBehavior);
        super.setQuackBehavior(quackBehavior);
    }
    public void display(){
        System.out.print("【外观是诱饵鸭】 ");
    }
}
