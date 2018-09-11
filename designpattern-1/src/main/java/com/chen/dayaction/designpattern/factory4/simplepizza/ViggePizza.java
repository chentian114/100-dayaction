package com.chen.dayaction.designpattern.factory4.simplepizza;

/**
 * 素食披萨
 */
public class ViggePizza extends Pizza {
    public void prepare(){
        System.out.println("制作素食披萨准备中：面皮、酱料、蔬菜");
    }

    public void bake(){
        System.out.println("素食披萨烘烤中。。。");
    }

    public void cut(){
        System.out.println("素食披萨切片");
    }

    public void box(){
        System.out.println("素食披萨装盒");
    }
}
