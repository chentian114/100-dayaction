package com.chen.dayaction.designpattern.template9.beverage;

public class Tea extends CoffeeBeverage {
    @Override
    protected void addCondimments() {
        System.out.println("添加柠檬！");
    }

    @Override
    protected void brew() {
        System.out.println("用沸水浸泡茶叶......");
    }
}
