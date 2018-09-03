package com.chen.dayaction.designpattern.decorator3.pancake;

public class Cucumber extends Condiment {
    private Pancake pancake;
    public Cucumber(Pancake pancake){
        this.pancake = pancake;
    }
    @Override
    public String getDesc() {
        return this.pancake.getDesc()+",黄瓜";
    }

    @Override
    public double price() {
        return this.pancake.price()+0.5;
    }
}
