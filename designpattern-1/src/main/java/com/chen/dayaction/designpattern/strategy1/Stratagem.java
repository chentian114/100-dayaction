package com.chen.dayaction.designpattern.strategy1;

import com.chen.dayaction.designpattern.strategy1.stratagem.*;

/**
 * 三个锦囊妙计案例：三个计策，分别在三种情况下使用。
 * 定义一组算法， 将每个算法都封装起来， 并且使它们之间可以互换。
 * 策略模式的优点：算法可以自由切换；扩展性良好；
 * 策略模式的缺点：策略类数量增多；所有的策略类都需要对外暴露；
 * 策略模式的使用场景：多个类只有在算法或行为上稍有不同的场景；算法需要自由切换的场景；需要屏蔽算法规则的场景。
 *
 */
public class Stratagem {

    public static void main(String[] args) {
        System.out.println("刘备到达江东，迎娶孙尚香...");
        Strategy strategy1 = new BackDoor();
        Context zhaoyun = new Context(strategy1);
        System.out.print("赵云");
        zhaoyun.operate();

        System.out.println("成亲完，准备离开江东...");
        Strategy strategy2 = new GivenGreenLight();
        zhaoyun.setStrategy(strategy2);
        System.out.print("赵云");
        zhaoyun.operate();

        System.out.println("离开途中，遇到追兵...");
        Strategy strategy3 = new BlockEnemy();
        zhaoyun.setStrategy(strategy3);
        System.out.print("赵云");
        zhaoyun.operate();
    }
}
