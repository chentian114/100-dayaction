package com.chen.dayaction.designpattern.strategy1;

import com.chen.dayaction.designpattern.strategy1.dackgame.*;

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
