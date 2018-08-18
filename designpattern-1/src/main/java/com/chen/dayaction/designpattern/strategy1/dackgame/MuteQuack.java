package com.chen.dayaction.designpattern.strategy1.dackgame;

public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("不能发出声音！");
    }
}
