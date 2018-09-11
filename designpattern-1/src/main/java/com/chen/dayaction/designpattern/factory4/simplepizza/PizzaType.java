package com.chen.dayaction.designpattern.factory4.simplepizza;

public enum PizzaType{
    CHEESE("cheese"),CLAM("clam"),PEPPERONI("pepperoni"),VIGGE("vigge");
    private String name;
    private PizzaType(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}