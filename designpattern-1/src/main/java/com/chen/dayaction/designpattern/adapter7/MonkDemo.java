package com.chen.dayaction.designpattern.adapter7;

import com.chen.dayaction.designpattern.adapter7.monk.LuZhiSheng;
import com.chen.dayaction.designpattern.adapter7.monk.Monk;

/**
 * 鲁智深出家当和尚案例：
 *  和尚需要吃斋、念经、打坐、撞钟、习武，但鲁智深出家后只习武，其它戒律确并不遵守，如何代码实现花和尚。
 * 缺省适配器：为一个接口提供缺省实现，这样子类型可以从这个缺省实现进行扩展，而不必从原有接中进行扩展。
 *  适用场景：在一些情况下，必须让一个具体类实现某一个接口，但是又用不到接口所规定的所有方法。
 *  缺省适配器很好的处理这一情况，设计一个抽象的适配器类实现接口，此抽象类给接口的所有方法提供一个空的方法。
 *  任何继承自抽象类的具体类都可以选择它所需要的方法进行实现，而不需要理会其它方法。
 *  缺省适配器的用意是为了方便建立一个不平庸的类而提供的一种平庸实现。
 */
public class MonkDemo {
    public static void main(String[] args) {
        Monk luzhisheng = new LuZhiSheng();
        luzhisheng.kungfu();
        luzhisheng.vegetarian();
    }
}
