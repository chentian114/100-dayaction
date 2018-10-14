package com.chen.dayaction.designpattern.adapter7;

import com.chen.dayaction.designpattern.adapter7.duck.*;

/**
 * 鸭子适配器案例：
 * 情况紧急，你需要一只鸭子上台表演，但你只有一只火鸡，所以你将火鸡打扮成鸭子上台表演了。
 *
 */
public class DuckAdapterDemo {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.fly();
        duck.quack();
        System.out.println("---------------------------------");
        Turkey turkey = new WildTurkey();
        turkey.fly();
        turkey.gobble();
        System.out.println("---------------------------------");
        //对象适配器
        Duck adapter= new DuckAdapter(turkey);
        adapter.fly();
        adapter.quack();
        System.out.println("---------------------------------");
        //类适配器
        Duck adapter2 = new DuckClassAdapter();
        adapter2.fly();
        adapter2.quack();
    }
}
