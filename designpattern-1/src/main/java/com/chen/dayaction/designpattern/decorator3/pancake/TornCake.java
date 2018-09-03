package com.chen.dayaction.designpattern.decorator3.pancake;

public class TornCake extends Pancake{

    public String getDesc(){
        return "手抓饼";
    }
    @Override
    public double price() {
        return 3.5;
    }
}
