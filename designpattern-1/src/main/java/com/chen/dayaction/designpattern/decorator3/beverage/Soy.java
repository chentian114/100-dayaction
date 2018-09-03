package com.chen.dayaction.designpattern.decorator3.beverage;

public class Soy extends CondimentDecorator {
    private Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 0.9 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Soy";
    }
}
