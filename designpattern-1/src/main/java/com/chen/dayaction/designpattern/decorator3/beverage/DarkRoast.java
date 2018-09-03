package com.chen.dayaction.designpattern.decorator3.beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        super.description = "深焙咖啡";
    }
    @Override
    public double cost() {
        return 7.0;
    }
}
