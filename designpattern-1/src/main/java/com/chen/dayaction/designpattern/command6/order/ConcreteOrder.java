package com.chen.dayaction.designpattern.command6.order;

public class ConcreteOrder extends Order {
    @Override
    public void orderUp() {
        System.out.println("点餐完成，通知厨师制作餐点。");
        System.out.println("----------------------------");
        super.getChef().action();
    }
}
