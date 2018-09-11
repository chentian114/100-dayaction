package com.chen.dayaction.designpattern.factory4;

import com.chen.dayaction.designpattern.factory4.simplepizza.Pizza;
import com.chen.dayaction.designpattern.factory4.simplepizza.PizzaType;
import com.chen.dayaction.designpattern.factory4.simplepizza.SimplePizzaFactory;

/**
 * 简单披萨工厂案例：当需要披萨时，就叫披萨工厂创建一个。
 * SimplePizzaFactory是创建披萨的工厂，createPizza()一般为静态的。
 * Pizza是我们的产品，定义为抽象类，具有一些有用的实现，这些实现可以被覆盖。
 *
 * 把创建披萨的代码移到另一个对象中，由这个新对象专职创建披萨，我们可以称这个新对象为工厂。
 * 把实例化对象的工作全部移到SimplePizzaFactory中，这样可以被多个客户调用；当以后实现改变时，只需修改这个类即可。
 */
public class SimplePizzaFactoryDemo {
    public static void main(String[] args) {
        String type = PizzaType.CHEESE.getName();
        Pizza pizza = SimplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println("==================================");
        type = PizzaType.CLAM.getName();
        pizza = SimplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

}
