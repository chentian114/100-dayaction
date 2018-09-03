package com.chen.dayaction.designpattern.decorator3.beverage;

public class Espresso extends Beverage {
    public Espresso(){
        super.description = "浓缩咖啡";
    }
    @Override
    public double cost() {
        return 14;
    }
}
