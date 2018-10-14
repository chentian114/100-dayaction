package com.chen.dayaction.designpattern.adapter7.duck;

public class WildTurkey implements Turkey
{
    @Override
    public void gobble() {
        System.out.println("turkey gobble gobble!");
    }

    @Override
    public void fly() {
        System.out.println("turkey flay short distance!");
    }
}
