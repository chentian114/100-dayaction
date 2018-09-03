package com.chen.dayaction.designpattern.decorator3;

import com.chen.dayaction.designpattern.decorator3.pancake.*;

/**
 * 煎饼摊案例：煎饼小摊卖两种煎饼手抓饼和肉夹膜，煎饼可以自由搭配不同的配料组合，每增加一样配料价钱加上该配料的价钱。
 * 配料有：黄瓜丝、火腿、肉松、煎蛋
 *
 * 分析：主体是煎饼，装饰者是配料。
 *
 */
public class PancakeDemo {

    public static void main(String[] args) {
        Pancake pancake1 = new TornCake();
        printCake(pancake1);
        Pancake pancake2 = new MeatCake();
        printCake(pancake2);

        pancake1 = new FireEgg(pancake1);
        pancake1 = new Cucumber(pancake1);
        printCake(pancake1);

        pancake2 = new MeatFloss(pancake2);
        pancake2 = new Ham(pancake2);
        pancake2 = new Cucumber(pancake2);
        printCake(pancake2);
    }

    public static void printCake(Pancake pancake){
        System.out.println(pancake.getDesc()+"：￥"+pancake.price());
    }

}
