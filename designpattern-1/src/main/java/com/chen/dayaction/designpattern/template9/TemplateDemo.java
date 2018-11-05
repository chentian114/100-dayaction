package com.chen.dayaction.designpattern.template9;

import com.chen.dayaction.designpattern.template9.template.AbstractTemplate;
import com.chen.dayaction.designpattern.template9.template.ConcreteTemplate1;
import com.chen.dayaction.designpattern.template9.template.ConcreteTemplate2;

/**
 * 模板模式类图案例
 * 是基于继承的代码复用的基本技术。
 * 抽象模板(Abstract Template)角色：
 *  定义了一个或多个抽象操作，以便让子类实现。这些抽象操作叫做基本操作，它们是一个顶级逻辑的组成步骤。
 *  定义并实现了一个模板方法。这个模板方法一般是一个具体方法，它给出了一个顶级逻辑的骨架，而逻辑的组成步骤在相应的抽象操作中，推迟到子类实现。
 * 具体模板(Concrete Template)角色：
 *  实现父类所定义的一个或多个抽象方法，它们是一个顶级逻辑的组成步骤。
 *  每一个抽象模板角色都可以有任意多个具体模板角色与之对应，而每一个具体模板角色都可以给出这些抽象方法的不同实现，从而使得顶级逻辑的实现各不相同。
 *
 * 抽象方法：一个抽象方法由抽象类声明，由具体子类实现。在Java语言里抽象方法以abstract关键字标示。
 * 具体方法：一个具体方法由抽象类声明并实现，而子类并不实现或置换。
 * 钩子方法：一个钩子方法由抽象类声明并实现，而子类会加以扩展。通常抽象类给出的实现是一个空实现，作为方法的默认实现。
 * 模板模式的关键是：子类可以置换掉父类的可变部分，但是子类却不可以改变模板方法所代表的顶级逻辑。
 *
 */
public class TemplateDemo {
    public static void main(String[] args) {
        AbstractTemplate template1 = new ConcreteTemplate1();
        template1.templateMethod();
        System.out.println("---------------");
        AbstractTemplate template2 = new ConcreteTemplate2();
        template2.templateMethod();
    }
}
