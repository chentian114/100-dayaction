package com.chen.dayaction.designpattern.adapter7.adapter;

public class Adapter implements Target{
    private Adaptee adaptee ;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

}
