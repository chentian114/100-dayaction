package com.chen.dayaction.designpattern.template9.beverage;

public class Coffee extends CoffeeBeverage {
    @Override
    protected void addCondimments() {
        System.out.println("添加糖和牛奶！");
    }

    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡！");
    }
}
