package com.chen.dayaction.designpattern.strategy1.dackgame;

public class RubberDuck extends Duck {
    public RubberDuck(FlyBehavior flyBehavior,QuackBehavior quackBehavior){
        super.setFlyBehavior(flyBehavior);
        super.setQuackBehavior(quackBehavior);
    }
    public void display(){
        System.out.print("【外观是橡胶鸭】 ");
    }
}
