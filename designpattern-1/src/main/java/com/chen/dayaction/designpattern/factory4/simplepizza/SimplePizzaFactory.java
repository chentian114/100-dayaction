package com.chen.dayaction.designpattern.factory4.simplepizza;
/**
 * 简单披萨工厂类：只做一件事，为客户创建披萨
 */
public class SimplePizzaFactory {
    public static Pizza createPizza(String type){
        if(PizzaType.CHEESE.getName().equals(type)){
            return new CheesePizza();
        }else if(PizzaType.CLAM.getName().equals(type)){
            return new ClamPizza();
        }else if(PizzaType.PEPPERONI.getName().equals(type)){
            return new PepperoniPizza();
        }else if(PizzaType.VIGGE.getName().equals(type)){
            return new ViggePizza();
        }
        return null;
    }
}