package com.chen.dayaction.designpattern.singleton5;

import com.chen.dayaction.designpattern.singleton5.thread.ThreadSingleton;

/**
 * 双重加检查的方式实现单例案例：
 * 通过使用双重检查与volatile与局部使用synchronized，在保证性能的情况下保证只创建单例。
 */
public class ThreadSingletonDemo {
    public static void main(String[] args) {
        for (int i=0; i <10 ; i++) {
            Thread t = new Thread(new MyRunnable4());
            t.setName("Thread"+i);
            t.start();
        }
    }
}

class MyRunnable4 implements Runnable{
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        ThreadSingleton instance = null;
        for (int i=0 ; i<ClassicSingletonDemo.MAX_SIZE; i++){
            instance = ThreadSingleton.getInstance();
        }
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+instance+":time cost "+(end-start)+"ms");
    }
}