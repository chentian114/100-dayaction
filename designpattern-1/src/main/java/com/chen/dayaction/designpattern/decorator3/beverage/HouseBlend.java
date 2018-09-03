package com.chen.dayaction.designpattern.decorator3.beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        super.description = "综合咖啡";
    }
    @Override
    public double cost() {
        return 6.3;
    }

}
