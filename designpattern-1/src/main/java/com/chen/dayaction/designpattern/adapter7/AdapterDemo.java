package com.chen.dayaction.designpattern.adapter7;

import com.chen.dayaction.designpattern.adapter7.adapter.*;

/**
 * 对象适配器模式实现案例：
 *  适配器模式把一个类的接口变换成客户端所期待的另一个接口，从而使原本因为接中不匹配而无法一起工作的两个类能够在一起工作。
 *  适配器模式的用意是要改变源的接口，以便于和目标接口相容。
 *  适配器模式根据实现不同可分为类适配器和对象适配器两种。
 *  类适配器与对象适配器对比：
 *      类适配器使用继承的方式，是静态的定义方式；而对象适配器使用对象组合的方式，是动态组合的方式。
 *      对于类适配器，适配器继承自Adaptee，使得适配器不能和Adaptee的子类或者兄弟类一起工作，继承是静态的，程序运行过程中无法改变。
 *      对于对象适配器，一个适配器可以把源类和它的子类都适配到目标接口，因为组合是动态的，程序运行过程中可以修改。
 *      对于类适配器，可以重定义Adaptee的部分行为，通过子类覆盖父类的实现方法。而对象适配重定义Adaptee的行为比较困难，只能进行一些新增。
 *  建议尽量使用对象适配器的实现方式，多用组合，少用继承。
 *  适配器模式的优点：
 *      更好的复用性；系统需要使用现有的类，而此类的接口不符合系统的需要，可以通过适配器可以让这些功能得到复用。
 *      更好的扩展性；在实现适配器的功能的时候，可以对适配的接口进行扩展。
 *  适配器模式的缺点：
 *      过多的使用适配器，会让系统非常零乱，不易整体进行把握。比如调用A接口，其实内部被适配成B的接口实现。
 *
 */
public class AdapterDemo {
    public static void main(String[] args) {
        Adaptee adaptee1 = new AdapteeImpl1();
        Adaptee adaptee2 = new AdapteeImpl2();

        Target adapter1 = new Adapter(adaptee1);
        adapter1.request();

        Target adapter2 = new Adapter(adaptee2);
        adapter2.request();
    }
}
