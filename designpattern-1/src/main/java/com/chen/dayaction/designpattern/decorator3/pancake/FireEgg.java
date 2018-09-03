package com.chen.dayaction.designpattern.decorator3.pancake;

public class FireEgg extends Condiment {
    private Pancake pancake;
    public FireEgg(Pancake pancake){
        this.pancake = pancake;
    }
    @Override
    public String getDesc() {
        return this.pancake.getDesc()+",鸡蛋";
    }

    @Override
    public double price() {
        return this.pancake.price()+1.5;
    }
}
