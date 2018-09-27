package com.chen.dayaction.designpattern.singleton5;

import com.chen.dayaction.designpattern.singleton5.enums.EnumSingleton;

/**
 * 使用枚举类型实现单例模式案例：
 * 使用枚举实现单例非常简单，只需要编写一个包含单个元素的枚举类型即可。
 * 使用枚举来实现单例控制会更加简洁，而且提供了序列化机制，并由JVM提供保障防止多次实例化。
 */
public class EnumSingletonDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new MyRunnable5());
            t.setName("Thread-" + i);
            t.start();
        }
    }
}

class MyRunnable5 implements Runnable{
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        EnumSingleton instance = null;
        for (int i=0 ; i<ClassicSingletonDemo.MAX_SIZE; i++){
            instance = EnumSingleton.uniqueInstance;
        }
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+instance+":"+(end-start)+"ms "+instance.operation());
    }
}
