package com.chen.dayaction.designpattern.factory4.simplepizza;

/**
 * 蛤蜊披萨
 */
public class ClamPizza extends Pizza {
    public void prepare(){
        System.out.println("制作蛤蜊披萨准备中：面皮、酱料、蛤蜊");
    }

    public void bake(){
        System.out.println("蛤蜊披萨烘烤中。。。");
    }

    public void cut(){
        System.out.println("蛤蜊披萨切片");
    }

    public void box(){
        System.out.println("蛤蜊披萨装盒");
    }
}
