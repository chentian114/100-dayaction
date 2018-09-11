package com.chen.dayaction.designpattern.factory4.abstractfactpizza;

public class ThickCrustDough implements Dough {
    @Override
    public void display() {
        System.out.println("厚皮比萨面团");
    }
}
