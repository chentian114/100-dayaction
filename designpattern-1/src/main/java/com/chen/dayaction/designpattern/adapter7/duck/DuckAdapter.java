package com.chen.dayaction.designpattern.adapter7.duck;

/**
 * 对象适配器
 */
public class DuckAdapter implements Duck {
    private Turkey turkey;
    public DuckAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        //火鸡飞5次和鸭子飞一次的距离相当
        for (int i=0; i<5; i++){
            turkey.fly();
        }
    }
}
