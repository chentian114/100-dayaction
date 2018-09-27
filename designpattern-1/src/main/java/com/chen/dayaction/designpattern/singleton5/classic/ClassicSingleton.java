package com.chen.dayaction.designpattern.singleton5.classic;

public class ClassicSingleton {
    private static ClassicSingleton instance;
    private ClassicSingleton(){

    }
    public static ClassicSingleton getInstance(){
        if(instance == null){
            sleepTime();
            instance = new ClassicSingleton();
        }
        return instance;
    }

    public static void sleepTime(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
