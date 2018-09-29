package com.chen.dayaction.designpattern.command6.order;

public class User {
    public Order createOrder(){
        System.out.println("客户进行点餐。");
        System.out.println("----------------------");
        Order order = new ConcreteOrder();
        return order;
    }
}
