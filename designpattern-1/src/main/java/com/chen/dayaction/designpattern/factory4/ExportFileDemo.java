package com.chen.dayaction.designpattern.factory4;

import com.chen.dayaction.designpattern.factory4.exportfile.*;

/**
 * Created by ChenTian on 2018/9/11.
 * 导出报表文件案例：
 *  系统需要支持对数据库中的数据进行导出，
 *  1）并且支持多种导出格式，如：HTML、PDF等，
 *  2）每种格式导出的结构有所不同，如标准报表、财务报表等。
 *
 *  案例分析：
 *  如果使用简单工厂模式，则工厂类必定过于臃肿。因为简单工厂模式只有一个工厂类，它需要处理所有的创建的逻辑。
 *      假如以上需求暂时只支持3种导出格式以及2种导出结构，那工厂类则需要6个if else来创建6种不同的类型。
 *      如果日后需求不断增加，则后果不堪设想。
 *  这时候就需要工厂方法模式来处理以上需求。
 *      在工厂方法模式中，将所有的对象的具体创建的工作交给子类去做。
 *      工厂方法抽象类ExportFactory有两个子类：ExportHtmlFactory、ExportPDFFactory分别负责创建导出格式为Html和PDF的对象
 *  总结：
 *  工厂方法模式的用意是定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类中。
 *  工厂方法抽象类角色：是工厂方法模式的核心，任何在模式中创建对象的工厂类必须实现这个接口。
 *  简单工厂模式把核心放在一个具体类上。
 *  工厂方法模式退化后可以变得很像简单工厂模式。设想如果非常确定一个系统只需要一个具体工厂类，那么不妨把抽象工厂类合并到具体工厂类中去。
 *  如果系统需要加入一个新的导出类型，那么所需要的就是向系统中加入一个这个导出类以及所对应的工厂类。
 *
 *  一个应用系统是由多人开发的，导出的功能是你实现的，但是使用者是其他人。
 *      这时候你应该设计的足够灵活并尽可能降低两者之间的耦合度，
 *      当你修改或增加一个新的功能时，使用者不需要修改任何地方。
 *      假如你的设计不够灵活，可能一个小的需求变更，便使得你的代码结构发生改变，并导致使用者都要修改他们的代码。
 */
public class ExportFileDemo {
    public static void main(String[] args) {
        //初始化一个创建导出格式为HTML文件的工厂对象
        ExportFactory factory = new ExportHtmlFactory();
        ExportFile file1 = factory.factoryMethod(ExportFileType.FINANCIAL); //财务报表
        file1.export();
        System.out.println("-------------------------------");

        ExportFile file2 = factory.factoryMethod(ExportFileType.STANDARD);  //标准报表
        file2.export();
        System.out.println("-------------------------------");

        //初始化一个创建导出格式为PDF文件的工厂对象
        ExportFactory factory2 = new ExportPDFFactory();
        ExportFile file3 = factory2.factoryMethod(ExportFileType.FINANCIAL); //财务报表
        file3.export();
        System.out.println("-------------------------------");

        ExportFile file4 = factory2.factoryMethod(ExportFileType.STANDARD);  //标准报表
        file4.export();
        System.out.println("-------------------------------");

    }
}
