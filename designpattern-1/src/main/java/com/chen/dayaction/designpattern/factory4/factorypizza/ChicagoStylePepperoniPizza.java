package com.chen.dayaction.designpattern.factory4.factorypizza;

import com.chen.dayaction.designpattern.factory4.simplepizza.Pizza;

/**
 * 芝加哥风味腊肠披萨
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public void prepare(){
        System.out.println("制作芝加哥风味腊肠披萨准备中：面皮、酱料、腊肠");
    }

    public void bake(){
        System.out.println("芝加哥风味腊肠披萨烘烤中。。。");
    }

    public void cut(){
        System.out.println("芝加哥风味腊肠披萨切片");
    }

    public void box(){
        System.out.println("芝加哥风味腊肠披萨装盒");
    }
}
