package com.chen.dayaction.designpattern.strategy1.dackgame;

public class RedHeadDuck extends Duck {
    public RedHeadDuck(FlyBehavior flyBehavior,QuackBehavior quackBehavior){
        super.setFlyBehavior(flyBehavior);
        super.setQuackBehavior(quackBehavior);
    }

    public void display(){
        System.out.print("【外观是红头鸭】 ");
    }
}
