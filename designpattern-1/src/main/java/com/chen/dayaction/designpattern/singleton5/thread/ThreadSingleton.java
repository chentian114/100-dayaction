package com.chen.dayaction.designpattern.singleton5.thread;

import com.chen.dayaction.designpattern.singleton5.classic.ClassicSingleton;

public class ThreadSingleton {
    private ThreadSingleton(){}
    private static volatile ThreadSingleton instance;
    public static ThreadSingleton getInstance(){
        if(instance==null){
            synchronized (ThreadSingleton.class){
                if(instance==null){
                    ClassicSingleton.sleepTime();
                    instance = new ThreadSingleton();
                }
            }
        }
        return instance;
    }
}
