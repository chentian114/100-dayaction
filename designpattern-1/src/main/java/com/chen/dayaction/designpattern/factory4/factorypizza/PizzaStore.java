package com.chen.dayaction.designpattern.factory4.factorypizza;

import com.chen.dayaction.designpattern.factory4.simplepizza.Pizza;

public abstract class PizzaStore {
    public abstract Pizza createPizza(String type);

    public void orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.bake();
    }
}
