package com.chen.dayaction.designpattern.command6.order;

public class Chef {
    public void action(){
        System.out.println("厨师开始制作餐点：");
        makeBurger();
        makeDrink();
    }
    public void makeBurger(){
        System.out.println("制作汉堡");
    }
    public void makeDrink(){
        System.out.println("制作饮料");
    }
}
