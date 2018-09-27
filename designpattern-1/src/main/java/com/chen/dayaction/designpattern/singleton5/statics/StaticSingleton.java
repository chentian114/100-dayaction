package com.chen.dayaction.designpattern.singleton5.statics;

public class StaticSingleton {
    private static StaticSingleton instance = new StaticSingleton();
    private StaticSingleton(){}
    public static StaticSingleton getInstance(){
        return instance;
    }
}
