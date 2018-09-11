package com.chen.dayaction.designpattern.factory4.abstractfactpizza;

public class ThinCrustDough implements Dough {
    @Override
    public void display() {
        System.out.println("薄皮比萨面团");
    }
}
