package com.chen.dayaction.designpattern.template9;

import com.chen.dayaction.designpattern.template9.model.CarModel;
import com.chen.dayaction.designpattern.template9.model.CarModelH1;
import com.chen.dayaction.designpattern.template9.model.CarModelH2;

/**
 * 车辆模型案例：
 * 车辆模型具备：启动、暂停、鸣喇叭、跑起来等功能，车辆模型有两个型号， H1和H2等，需要实现车辆模型。
 * 其中H1需要客户自己来选择是否需要鸣喇叭的功能。
 * 在软件开发过程中，如果相同的一段代码复制过两次，就需要对设计产生怀疑，架构师要明确地说明为什么相同的逻辑要出现两次或更多次。
 * 定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * AbstractClass叫做抽象模板，它的方法分为两类：
 *  基本方法也叫做基本操作，是由子类实现的方法，并且在模板方法被调用。
 *  模板方法，可以有一个或几个，一般是一个具体方法，也就是一个框架，实现对基本方法的调度，完成固定的逻辑。
 *  注意：为了防止恶意的操作，一般模板方法都加上final关键字，不允许被覆写。
 *  优点
 *      封装不变部分，扩展可变部分。把认为是不变部分的算法封装到父类实现，而可变部分的则可以通过继承来继续扩展。
 *      提取公共部分代码，便于维护。
 *      行为由父类控制，子类实现。
 *  缺点
 *      抽象类定义了部分抽象方法，由子类实现，子类执行的结果影响了父类的结果，也就是子类对父类产生了影响，这在复杂的项目中，会带来代码阅读的难度。
 *  使用场景
 *      多个子类有公有的方法，并且逻辑基本相同时。
 *      重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现。
 *      重构时，把相同的代码抽取到父类中，然后通过钩子函数约束其行为。
 */

public class ModelDemo {
    public static void main(String[] args) {
        CarModel model1 = new CarModelH1();
        ((CarModelH1) model1).setAlarm(false);
        model1.run();
        System.out.println("-----------------------");
        ((CarModelH1) model1).setAlarm(true);
        model1.run();
        System.out.println("------------------------");

        CarModel model2 = new CarModelH2();
        model2.run();
    }

}
