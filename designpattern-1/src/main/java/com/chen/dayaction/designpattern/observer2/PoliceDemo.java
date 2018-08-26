package com.chen.dayaction.designpattern.observer2;

import com.chen.dayaction.designpattern.observer2.police.PoliceQing;
import com.chen.dayaction.designpattern.observer2.police.PoliceSeng;
import com.chen.dayaction.designpattern.observer2.police.PoliceTian;
import com.chen.dayaction.designpattern.observer2.police.Susupect;

/**
 * 警察蹲点监察嫌犯案例
 * 观察者模式定义的是一对多的依赖关系，一个被观察者可以拥有多个观察者，并且通过接口对观察者与被观察者进行逻辑解耦，降低二者的直接耦合。
 */
public class PoliceDemo {
    public static void main(String[] args) {

        Susupect susupect = new Susupect();
        PoliceSeng seng = new PoliceSeng();
        PoliceQing qing = new PoliceQing();
        PoliceTian tian = new PoliceTian();

        susupect.registerObserver(seng);
        susupect.registerObserver(qing);
        susupect.registerObserver(tian);

        susupect.updateActiveInfo("准备潜逃。。。");

    }
}
