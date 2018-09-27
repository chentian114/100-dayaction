package com.chen.dayaction.designpattern.singleton5;

import com.chen.dayaction.designpattern.singleton5.thread.ThreadSingleton;

/**
 * 双重加检查加锁的方式实现单例案例：
 * 通过使用双重检查与volatile与局部使用synchronized，在实现线程安全地创建单例情况下不会对性能有太大的影响。
 * 只有第一次创建单例的时间需要同步。
 * 被volatile修饰的变量的值，将不会被本地线程缓存，所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量。
 * 由于volatile关键字可能会屏蔽掉虚拟机中一些必要的代码优化，所以运行效率并不是很高。因此一般，没有特别需要，不要使用。
 *
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