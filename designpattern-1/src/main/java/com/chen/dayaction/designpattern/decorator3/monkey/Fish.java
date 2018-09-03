package com.chen.dayaction.designpattern.decorator3.monkey;

public class Fish extends Change {
    public Fish(TheGreatestSage theGreatestSage) {
        super(theGreatestSage);
    }

    @Override
    public void move(){
        System.out.println("变成鱼儿移动");
    }

    public void swim(){
        System.out.println("变成鱼儿游泳");
    }
}
