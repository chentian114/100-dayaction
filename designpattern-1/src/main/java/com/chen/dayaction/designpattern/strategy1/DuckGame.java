package com.chen.dayaction.designpattern.strategy1;

import com.chen.dayaction.designpattern.strategy1.dackgame.*;

/**
 * 鸭子游戏案例：现有各种鸭子，为它们增加飞行和叫声的行为。
 * 策略模式：定义一个算法族，使它们可以相互替换，使得算法可独立于使用它的客户而变化。
 * OO原则：封装变化、多用组合，少用继承、针对接口编程，不针对实现编程
 */
public class DuckGame {
    public static void main(String[] args) {
        for(DuckDisplayEnum obj : DuckDisplayEnum.values()){
            Duck duck = duckFactory(obj);
            duck.display();
            duck.performFly();
            duck.performQuack();
        }
    }

    public static Duck duckFactory(DuckDisplayEnum display){
        switch (display){
            case QUACK_DISPLAY_DECOY:
                return new DecoyDuck(new FlyNoWay(),new MuteQuack());
            case QUACK_DISPLAY_MALLARD:
                return new MallardDuck(new FlyWithWings(),new Quack());
            case QUACK_DISPLAY_REDHEAD:
                return new RedHeadDuck(new FlyWithWings(),new Quack());
            case QUACK_DISPLAY_RUBBER:
                return new RubberDuck(new FlyNoWay(),new Squeak());
        }
        return null;
    }
}
