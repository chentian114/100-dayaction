package com.chen.dayaction.designpattern.factory4.abstractfactpizza;

public interface PizzaIngredientFactory {
    public Dough createDough(); //面团
    public Sauce createSauce(); //酱料
    public Cheese createCheese(); //芝士
}
