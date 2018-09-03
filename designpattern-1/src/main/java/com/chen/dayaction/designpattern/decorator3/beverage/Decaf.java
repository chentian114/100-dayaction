package com.chen.dayaction.designpattern.decorator3.beverage;

public class Decaf extends Beverage {
    public Decaf(){
        super.description = "低咖啡因咖啡";
    }
    @Override
    public double cost() {
        return 8.2;
    }
}
