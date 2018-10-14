package com.chen.dayaction.designpattern.adapter7.duck;

/**
 * 类适配器
 */
public class DuckClassAdapter extends WildTurkey implements Duck {
    @Override
    public void quack() {
        super.gobble();
    }

    public void fly(){
        //火鸡飞5次和鸭子飞一次的距离相当
        for (int i=0; i<5; i++){
            super.fly();
        }
   }

}
