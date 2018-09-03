package com.chen.dayaction.designpattern.decorator3.pancake;

public class Ham extends Condiment {
    private Pancake pancake;
    public Ham(Pancake pancake){
        this.pancake = pancake;
    }
    @Override
    public String getDesc() {
        return this.pancake.getDesc()+",火腿";
    }

    @Override
    public double price() {
        return this.pancake.price()+1;
    }
}
