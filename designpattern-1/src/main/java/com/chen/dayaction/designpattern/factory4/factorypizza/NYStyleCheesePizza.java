package com.chen.dayaction.designpattern.factory4.factorypizza;

import com.chen.dayaction.designpattern.factory4.simplepizza.Pizza;

/**
 * 纽约风味芝士披萨
 */
public class NYStyleCheesePizza extends Pizza {
    public void prepare(){
        System.out.println("制作纽约风味芝士披萨准备中：面皮、酱料、芝士");
    }

    public void bake(){
        System.out.println("纽约风味芝士披萨烘烤中。。。");
    }

    public void cut(){
        System.out.println("纽约风味芝士披萨切片");
    }

    public void box(){
        System.out.println("纽约风味芝士披萨装盒");
    }
}
