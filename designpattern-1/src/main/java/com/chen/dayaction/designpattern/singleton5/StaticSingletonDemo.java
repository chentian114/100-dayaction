package com.chen.dayaction.designpattern.singleton5;

import com.chen.dayaction.designpattern.singleton5.statics.StaticSingleton;

/**
 * 急切的单例模式案例：
 * 在静态加载类时创建对象
 */
public class StaticSingletonDemo {
    public static void main(String[] args) {
        for (int i=0; i <10 ; i++) {
            Thread t = new Thread(new MyRunnable2());
            t.setName("Thread-"+i);
            t.start();
        }
    }
}

class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        StaticSingleton instance = null;
        for (int i=0 ; i<ClassicSingletonDemo.MAX_SIZE; i++){
            instance = StaticSingleton.getInstance();
        }
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+instance+": time cost "+(end-start)+"ms");
    }
}