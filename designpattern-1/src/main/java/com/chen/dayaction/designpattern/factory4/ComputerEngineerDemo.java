package com.chen.dayaction.designpattern.factory4;

import com.chen.dayaction.designpattern.factory4.computer.*;

/**
 * Created by ChenTian on 2018/9/11.
 * 电脑工程师组装电脑案例：
 *  我们在组装电脑的时候，通常需要选择一系列的配件，比如CPU、主板等。
 *  在确定装机方案时，需要整体考虑各个配件之间的兼容性。
 *  比如：CPU和主板，Intel的CPU根本就插不到AMD的主板中。CPU对象和主板对象其实是有关系的，需要相互匹配的。
 *  案例分析：
 *  对于装机工程师，只需要知道CPU和主板的接口，而需要不知道具体实现。
 *
 * 总结：
 *  每一个模式都是针对一定问题的解决方案。
 *  抽象工厂模式与工厂方法模式的最大区别就在于，工厂方法模式针对的是一个产品等级结构；而抽象工厂模式则需要面对多个产品等级结构。
 *  产品族，是指位于不同产品等级结构中，功能相关联的产品组成的家族。如AMD的主板、芯片组、CPU组成一个家族，Intel的主板、芯片组、CPU组成一个家族。
 *  而这两个家族都来自于三个产品等级：主板、芯片组、CPU。一个等级结构是由相同的结构的产品组成。
 *  抽象工厂模式的好处：一个工厂等级结构可以创建出分属于不同产品等级结构的一个产品族中的所有对象。
 *  抽象工厂的功能是为一系列相关对象或相互依赖的对象创建一个接口。
 *  由于抽象工厂定义的一系列对象通常是相关或相互依赖的，这些产品对象就构成了一个产品族，也就是抽象工厂定义了一个产品族。
 *
 * 优点：
 *  分离接口和实现；客户端使用抽象工厂来创建需要的对象，而客户端根本就不知道具体的实现是谁。
 *  使切换产品族变得容易；
 * 缺点：
 *  不太容易扩展新的产品；如果需要给整个产品族添加一个新的产品，那么就需要修改抽象工厂，这样就会导致修改所有的工厂实现类。
 */
public class ComputerEngineerDemo {
    public static void main(String[] args) {
        AbstractFactory factory1 = new IntelComputeFactory();
        makeConputer(factory1);

        System.out.println("---------------------");
        AbstractFactory factory2 = new AmdComputeFactory();
        makeConputer(factory2);

    }

    private static void makeConputer(AbstractFactory factory) {
        Cpu cpu = factory.createCpu();
        Mainboard mainboard = factory.createMainboard();

        System.out.println("电脑工程师组装新电脑：");
        cpu.display();
        mainboard.display();
    }


}
