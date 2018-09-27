package com.chen.dayaction.designpattern.singleton5;

import com.chen.dayaction.designpattern.singleton5.classic.ClassicSingleton;

/**
 * 经典的单例模式案例：
 * 在多线程环境下会出错
 */
public class ClassicSingletonDemo {
    public static int MAX_SIZE = 1000000;
    public static void main(String[] args) {
       // System.out.println(ClassicSingleton.getInstance());

        for (int i=0; i <10 ; i++) {
            Thread t = new Thread(new MyRunnable());
            t.setName("Thread-"+i);
            t.start();
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        ClassicSingleton instance = null;
        for (int i=0 ; i<ClassicSingletonDemo.MAX_SIZE; i++){
            instance = ClassicSingleton.getInstance();
        }
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+instance+":"+(end-start)+"ms");
    }
}