package com.chen.dayaction.designpattern.factory4.factorypizza;

import com.chen.dayaction.designpattern.factory4.simplepizza.Pizza;
import com.chen.dayaction.designpattern.factory4.simplepizza.PizzaType;

/**
 * 芝加哥风味披萨工厂实现类
 */
public  class ChicagoStylePizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        if(PizzaType.CHEESE.getName().equals(type)){
            return new ChicagoStyleCheesePizza();
        }else if(PizzaType.CLAM.getName().equals(type)){
            return new ChicagoStyleClamPizza();
        }else if(PizzaType.PEPPERONI.getName().equals(type)){
            return new ChicagoStylePepperoniPizza();
        }else if(PizzaType.VIGGE.getName().equals(type)){
            return new ChicagoStyleViggePizza();
        }
        return null;
    }
}
