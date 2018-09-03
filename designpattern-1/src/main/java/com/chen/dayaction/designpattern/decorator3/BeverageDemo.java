package com.chen.dayaction.designpattern.decorator3;

import com.chen.dayaction.designpattern.decorator3.beverage.*;

/**
 * 咖啡店案例：有四种咖啡（综合咖啡、深焙咖啡、低咖啡因咖啡、浓缩咖啡），每种咖啡可以加不同的配料组合。
 * 配料包括（摩卡、奶泡、豆浆、牛奶），每加一种配料，咖啡的价格要加上相应配料的价钱。
 */
public class BeverageDemo {
    public static void main(String[] args) {
        Beverage beverage1 = new Decaf();
        printBeverage(beverage1);

        beverage1 = new Soy(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Milk(beverage1);
        printBeverage(beverage1);

        Beverage beverage2 = new DarkRoast();
        printBeverage(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Mocha(beverage2);
        printBeverage(beverage2);


        Beverage beverage3 = new Espresso();
        printBeverage(beverage3);
        beverage3 = new Milk(beverage3);
        beverage3 = new Mocha(beverage3);
        printBeverage(beverage3);

        Beverage beverage4 = new HouseBlend();
        printBeverage(beverage4);
        beverage4 = new Soy(beverage4);
        printBeverage(beverage4);

    }

    public static void printBeverage(Beverage beverage){
        System.out.println(beverage.getDescription()+": $"+beverage.cost());
    }
}
