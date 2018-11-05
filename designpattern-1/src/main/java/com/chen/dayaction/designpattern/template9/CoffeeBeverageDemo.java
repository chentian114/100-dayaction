package com.chen.dayaction.designpattern.template9;

import com.chen.dayaction.designpattern.template9.beverage.Coffee;
import com.chen.dayaction.designpattern.template9.beverage.CoffeeBeverage;
import com.chen.dayaction.designpattern.template9.beverage.Tea;

/**
 * 泡茶与咖啡案例：
 * 茶和咖啡的冲泡方式非常相似：
 * 冲咖啡：1）把水煮沸2）用沸水冲泡咖啡3）把咖啡倒进杯子4）加糖和牛奶
 * 冲泡茶：1）把水煮沸2）用沸水浸泡茶叶3）把茶倒进杯子4）加柠檬
 * 封装算法。两种饮料的冲泡方法是基本相同的，只是一些步骤需要不同的实现。所以我们泛化了冲泡方法，把它放在基类。
 * 一些步骤依赖子类进行，咖啡因饮料基类了解和控制冲泡方法的步骤，亲自执行步骤1和步骤3，依赖具体子类实现来完成步骤2和步骤4.
 * */
public class CoffeeBeverageDemo {
    public static void main(String[] args) {
        CoffeeBeverage tea = new Tea();
        tea.prepareRecipe();

        CoffeeBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }

}

