package com.chen.dayaction.designpattern.decorator3;

import com.chen.dayaction.designpattern.decorator3.monkey.Bird;
import com.chen.dayaction.designpattern.decorator3.monkey.Fish;
import com.chen.dayaction.designpattern.decorator3.monkey.Monkey;
import com.chen.dayaction.designpattern.decorator3.monkey.TheGreatestSage;

/**
 * 孙大圣变化案例：孙大圣本体是只猴子，他可以变成不同的动物：鱼、鸟。他的每一种变化都给他带来一种附加的本领。他变成鱼儿时，就可以到水里游泳；他变成鸟儿时，就可以在天上飞行。
 * 装饰者模式又名包装模式。装饰者模式以对客户端透明的方式扩展对象的功能，是继承的一个替代方案。
 * 装饰者模式的优点：1）目的在于扩展对象的功能。装饰者模式提供比继承更好的灵活性。装饰是动态的，运行时可以修改的；继承是静态的，编译期便已确定好。
 *  2）通过使用不同的装饰类及对它们的排列组合，可以创造出许多不同行为的组合。
 * 装饰者模式的缺点：1）会产生更多的对象。2）调试时不易排查错误。
 *
 * 装饰模式有透明和半透明两种，这两种的区别就在于装饰角色的接口与抽象构件角色的接口是否完全一致。
 *   1）透明的装饰模式也就是理想的装饰模式，要求具体构件角色、装饰角色的接口与抽象构件角色的接口完全一致。
 *   2）装饰角色的接口比抽象构件角色的接口宽的话，装饰角色实际上已经成了一个适配器角色，称为“半透明”的装饰模式。
 *
 *  装饰者模式：增强功能、不改变接口。
 *  半透明装饰者模式：增强功能、改变接口。
 *  适配器模式：不增加功能、改变接口。
 *
 */
public class MonkeyDemo  {
    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
        sage.move();

        System.out.println("--------------------------");
        sage = new Bird(sage);
        sage.move();

        System.out.println("--------------------------");
        Bird bird = new Bird(sage);
        bird.fly();

        System.out.println("--------------------------");
        sage = new Fish(sage);
        sage.move();

        System.out.println("--------------------------");
        Fish fish = new Fish(sage);
        fish.swim();

    }
}
