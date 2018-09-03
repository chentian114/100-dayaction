package com.chen.dayaction.designpattern.decorator3.beverage;

public abstract class Beverage {
    String description = "Unknown Beverage";
    public abstract double cost();
    public String getDescription(){
        return this.description;
    }

}
