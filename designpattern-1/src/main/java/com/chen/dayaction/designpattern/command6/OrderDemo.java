package com.chen.dayaction.designpattern.command6;

import com.chen.dayaction.designpattern.command6.order.Chef;
import com.chen.dayaction.designpattern.command6.order.Order;
import com.chen.dayaction.designpattern.command6.order.User;
import com.chen.dayaction.designpattern.command6.order.Waiter;

/**
 * 点餐案例：
 * 客户点餐，填写订单，招待员拿到订单将其放到订单栏，并通知厨师制作餐点。
 */
public class OrderDemo {
    public static void main(String[] args) {
        User user = new User();
        Order order = user.createOrder();

        Chef chef = new Chef();
        order.setChef(chef);

        Waiter waiter = new Waiter();
        waiter.takeOrder(order);
    }
}
