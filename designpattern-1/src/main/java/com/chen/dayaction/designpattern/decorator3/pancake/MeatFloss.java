package com.chen.dayaction.designpattern.decorator3.pancake;

public class MeatFloss extends Condiment {
    private Pancake pancake;
    public MeatFloss(Pancake pancake){
        this.pancake = pancake;
    }
    @Override
    public String getDesc() {
        return this.pancake.getDesc()+",肉松";
    }

    @Override
    public double price() {
        return this.pancake.price()+2.0;
    }
}
