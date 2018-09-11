package com.chen.dayaction.designpattern.factory4;

import com.chen.dayaction.designpattern.factory4.factoryhuman.BlackHumanFactory;
import com.chen.dayaction.designpattern.factory4.factoryhuman.HumanFactory;
import com.chen.dayaction.designpattern.factory4.factoryhuman.WhiteHumanFactory;
import com.chen.dayaction.designpattern.factory4.factoryhuman.YellowHumanFactory;

/**
 * 女娲造人案例:
 * 女娲使用乾坤鼎造出不同肤色的人。
 *
 * 案例分析：
 * 对造人过程进行分析，该过程涉及三个对象：女娲、乾坤鼎、三种不同肤色的人。
 * 女娲可以用客户来表示，乾坤鼎类似于一个工厂，负责制造生产产品（即人类），
 * 三种不同肤色的人，都是同一个接口下的不同实现类， 对于乾坤鼎来说都是它生产出的产品。
 *
 * 总结：
 * 优点：
 * 1）良好的封装性，代码结构清晰。一个对象创建是有条件约束的，如一个调用者需要一个具体的产品对象，只要知道这个产品的类名就可以了，不用知道创建对象的过程， 降低模块间的耦合。
 * 2）工厂方法模式的扩展性非常优秀。在增加产品类的情况下，只要适当地修改具体的工厂类或扩展一个工厂类，就可以完成“拥抱变化”。
 * 3）屏蔽产品类。调用者只需要关心产品的接口，只要接口保持不变，系统中的上层模块就不需要发生变化。因为产品类的实例化工作是由工厂类负责的，生成具体哪一个产品是由工厂类决定的。
 * 4）工厂方法模式是典型的解耦框架。高层模块值需要知道产品的抽象类，其他的实现类都不用关心。
 * 使用场景：
 * 1）工厂方法模式是new一个对象的替代品，所有需要生成对象的地方都可以使用,但需要慎重地考虑是否要增加一个工厂类进行管理增加代码的复杂度。
 * 2）需要灵活的、可扩展的框架时，可以考虑采用工厂方法模式。
 */
public class FactoryHumanDemo {
    public static void main(String[] args) {
        HumanFactory factory1 = new WhiteHumanFactory();
        HumanFactory factory2 = new BlackHumanFactory();
        HumanFactory factory3 = new YellowHumanFactory();

        createHuman(factory1);
        createHuman(factory2);
        createHuman(factory3);
    }

    public static void createHuman(HumanFactory factory){
        System.out.print("女娲造人：");
        factory.factoryMethod().display();
        System.out.println("--------------------");
    }
}
