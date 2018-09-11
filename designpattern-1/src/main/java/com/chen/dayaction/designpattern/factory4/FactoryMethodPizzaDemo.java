package com.chen.dayaction.designpattern.factory4;

import com.chen.dayaction.designpattern.factory4.factorypizza.ChicagoStylePizzaStore;
import com.chen.dayaction.designpattern.factory4.factorypizza.NYStylePizzaStore;
import com.chen.dayaction.designpattern.factory4.factorypizza.PizzaStore;
import com.chen.dayaction.designpattern.factory4.simplepizza.PizzaType;

/**
 * 工厂方法模式披萨工厂案例：每个区域类型创建一个PizzaStore（NYPizzaStore、ChicagoPizzaStore、CaliforniaPizzaStore），每个子类各自决定如何制作披萨。
 * 工厂方法用来处理对象的创建，并将这样的行为封装在子类中。这样，客户程序中关于超类的代码就和子类对象创建代码解耦了。
 *
 */
public class FactoryMethodPizzaDemo {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYStylePizzaStore();
        pizzaStore.orderPizza(PizzaType.CHEESE.getName());
        System.out.println("===========================");
        pizzaStore.orderPizza(PizzaType.CLAM.getName());
        System.out.println("===========================");

        PizzaStore pizzaStore2 = new ChicagoStylePizzaStore();
        pizzaStore2.orderPizza(PizzaType.CHEESE.getName());
        System.out.println("===========================");
        pizzaStore2.orderPizza(PizzaType.CLAM.getName());
    }
}
