package com.chen.dayaction.designpattern.decorator3.monkey;

public class Bird extends Change {
    public Bird(TheGreatestSage theGreatestSage) {
        super(theGreatestSage);
    }

    @Override
    public void move(){
        System.out.println("变成鸟儿移动");
    }

    public void fly(){
        System.out.println("变成鸟儿飞起");
    }
}
