package com.chen.dayaction.designpattern.singleton5;

import com.chen.dayaction.designpattern.singleton5.synchronizeds.SynchronizedSingleton;

/**
 * 同步的单例模式案例：
 * 直接在获取单例的方法上通过synchronized同步来获取单例，在大量调用的情况下，性能会越来越差。
 */
public class SynchronizedSingletonDemo {
    public static void main(String[] args) {
        for (int i=0; i <10 ; i++) {
            Thread t = new Thread(new MyRunnable3());
            t.setName("Thread"+i);
            t.start();
        }
    }
}

class MyRunnable3 implements Runnable{
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        SynchronizedSingleton instance = null;
        for (int i=0 ; i<ClassicSingletonDemo.MAX_SIZE; i++){
            instance = SynchronizedSingleton.getInstance();
        }
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+instance+":time cost "+(end-start)+"ms");
    }
}