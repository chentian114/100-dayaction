package com.chen.dayaction.designpattern.factory4.factorypizza;

import com.chen.dayaction.designpattern.factory4.simplepizza.*;

/**
 * 纽约风味披萨工厂实现类
 */
public  class NYStylePizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        if(PizzaType.CHEESE.getName().equals(type)){
            return new NYStyleCheesePizza();
        }else if(PizzaType.CLAM.getName().equals(type)){
            return new NYStyleClamPizza();
        }else if(PizzaType.PEPPERONI.getName().equals(type)){
            return new NYStylePepperoniPizza();
        }else if(PizzaType.VIGGE.getName().equals(type)){
            return new NYStyleViggePizza();
        }
        return null;
    }
}
