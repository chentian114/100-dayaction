package com.chen.dayaction.designpattern.singleton5.synchronizeds;

import com.chen.dayaction.designpattern.singleton5.classic.ClassicSingleton;

public class SynchronizedSingleton {
    private SynchronizedSingleton(){}
    private static SynchronizedSingleton instance;
    public static synchronized SynchronizedSingleton getInstance(){
        if(instance==null){
            ClassicSingleton.sleepTime();
            instance = new SynchronizedSingleton();
        }
        return instance;
    }

}
