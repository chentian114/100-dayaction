package com.chen.dayaction.designpattern.decorator3.beverage;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 1.0 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }
}
