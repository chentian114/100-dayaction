package com.chen.dayaction.designpattern.strategy1.dackgame;

public class MallardDuck extends Duck {
    public MallardDuck(FlyBehavior flyBehavior,QuackBehavior quackBehavior){
        super.setFlyBehavior(flyBehavior);
        super.setQuackBehavior(quackBehavior);
    }

    public void display(){
        System.out.print("【外观绿头鸭】 ");
    }
}
