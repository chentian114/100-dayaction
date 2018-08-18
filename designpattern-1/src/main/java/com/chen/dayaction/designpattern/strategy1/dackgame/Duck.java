package com.chen.dayaction.designpattern.strategy1.dackgame;

public abstract class Duck {
    private FlyBehavior flyBehavior;    //飞行行为，面向接口编程
    private QuackBehavior quackBehavior;    //叫声行为

    public abstract void display();
    public void swim(){
        System.out.println("游泳......");
    }
    public void performFly(){
        flyBehavior.fly();  //委托给具体的飞行行为类实现，鸭子类不需要关注具体的飞行行为
    }
    public void performQuack(){
        quackBehavior.quack(); //委托给具体的叫声行为类实现
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

}
