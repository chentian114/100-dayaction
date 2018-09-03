package com.chen.dayaction.designpattern.decorator3.pancake;

public class MeatCake extends Pancake{

    public String getDesc(){
        return "肉夹膜";
    }
    @Override
    public double price() {
        return 4.5;
    }
}
