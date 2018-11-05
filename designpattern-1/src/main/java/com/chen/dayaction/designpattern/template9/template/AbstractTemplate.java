package com.chen.dayaction.designpattern.template9.template;

/**
 * 模板类
 */
public abstract class AbstractTemplate {
    //模板方法
    public void templateMethod(){
        abstractMethod();
        hookMethod();
        concreteMethod();
    }
    //基本方法的声明（由子类实现） abstractMethod()方法所代表的就是强制子类实现的剩余逻辑
    protected abstract void abstractMethod();
    //而hookMethod()方法是可选择实现的逻辑，不是必须实现的。
    protected  void hookMethod(){
        System.out.println("nothing!");
    }

    protected  void concreteMethod(){
        System.out.println("concrete template method!");
    }
}
