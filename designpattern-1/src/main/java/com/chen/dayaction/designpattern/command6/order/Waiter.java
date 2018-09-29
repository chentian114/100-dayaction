package com.chen.dayaction.designpattern.command6.order;

public class Waiter {
    public void takeOrder(Order order){
        System.out.println("服务员拿到订单。");
        System.out.println("----------------");
        order.orderUp();
    }
}
