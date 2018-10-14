package com.chen.dayaction.designpattern.adapter7.adapter;

public class AdapteeImpl1 implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println(this.getClass()+"specificRequest deal!");
    }
}
