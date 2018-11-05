package com.chen.dayaction.designpattern.template9.beverage;

/**
 * 咖啡因饮料
 */
public abstract class CoffeeBeverage {

    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondimments();
    }

    /** 添加调料 */
    protected abstract void addCondimments();

    protected  final void pourInCup(){
        System.out.println("将饮料进行装杯！");
    }

    /** 冲泡咖啡因饮料*/
    protected abstract void brew();

    protected  final void boilWater(){
        System.out.println("煮开水......");
    }



}
