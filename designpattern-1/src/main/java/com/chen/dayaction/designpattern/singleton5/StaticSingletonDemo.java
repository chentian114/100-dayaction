package com.chen.dayaction.designpattern.singleton5;

import com.chen.dayaction.designpattern.singleton5.statics.StaticSingleton;

/**
 * 急切的单例模式案例：
 *  在静态加载类时创建对象
 *  单例模式的优点：1）减少内存开支2）减少创建对象所需系统的性能开销3）避免资源的多重占用
 *  单例模式的缺点：1）扩展困难，只能直接对代码进行修改
 *  单例模式的使用场景：1）要求生成唯一序列号的环境2）整个项目中只需要一个共享访问点
 *  3）创建一个对象需要消耗的资源过多
 *
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