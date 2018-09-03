package com.chen.dayaction.designpattern.decorator3.beverage;

public class Milk extends CondimentDecorator {
    private Beverage beverage;
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 1.3 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Milk";
    }
}
