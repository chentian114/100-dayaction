package com.chen.dayaction.designpattern.decorator3.monkey;

public class Change implements TheGreatestSage {
    private TheGreatestSage theGreatestSage;
    public Change(TheGreatestSage theGreatestSage){
        this.theGreatestSage = theGreatestSage;
    }

    @Override
    public void move() {
        theGreatestSage.move();
    }
}
