package com.chen.dayaction.designpattern.decorator3.beverage;

public class Whip extends CondimentDecorator {
    private Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 0.5 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }
}
