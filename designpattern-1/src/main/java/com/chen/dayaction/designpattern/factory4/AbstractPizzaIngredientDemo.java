package com.chen.dayaction.designpattern.factory4;

import com.chen.dayaction.designpattern.factory4.abstractfactpizza.*;

/**
 * 披萨原料工厂：
 * 披萨原料有：面团、酱料、奶酪等。
 * 不同地区风味的披萨原料是不同的，纽约风味的披萨使用的原料是：薄饼面团、加番茄酱、雷奇亚干酪奶酪等。
 * 芝加哥风味的披萨使用的原料是：厚饼面团、李子番茄酱、马苏里拉奶酪等
 *
 */
public class AbstractPizzaIngredientDemo {
    public static void main(String[] args) {
        PizzaIngredientFactory factory1 = new NYPizzaIngredientFactory();
        System.out.println("准备纽约风味的披萨原料：");
        makePizza(factory1);
        System.out.println("---------------");
        System.out.println("准备芝加哥风味的披萨原料：");
        PizzaIngredientFactory factory2 = new ChicagoPizzaIngredientFactory();
        makePizza(factory2);
    }

    private static void makePizza(PizzaIngredientFactory factory) {
        Sauce sauce = factory.createSauce();
        Dough dough = factory.createDough();
        Cheese cheese = factory.createCheese();

        dough.display();
        sauce.display();
        cheese.display();
    }


}
