package com.chen.dayaction.designpattern.command6.order;

public abstract class Order {
    private Chef chef ;

    public void setChef(Chef chef){
        this.chef = chef;
    }
    public Chef getChef(){
        return chef;
    }

    public abstract void orderUp();
}
