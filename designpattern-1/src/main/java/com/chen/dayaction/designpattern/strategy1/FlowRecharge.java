package com.chen.dayaction.designpattern.strategy1;

import com.alibaba.fastjson.JSON;
import com.chen.dayaction.designpattern.strategy1.flowrecharge.FlowRechargeChannelEnum;
import com.chen.dayaction.designpattern.strategy1.flowrecharge.Recharge;

/**
 * 流量冲值案例：流量冲值，根据客户选择的不同产品，选择相应的冲值渠道进行冲值。
 * 策略模式属于行为型模式。
 * 策略模式将可变的部分从程序口抽象分离成算法接口，基于该接口实现一系列算法。
 * 特点是最终的结果是固定的，执行过程和执行逻辑不一致。例如：出行方式、支付方式等。
 */
public class FlowRecharge {
    public static void main(String[] args) {
        String phone = "180****4543";
        long productId = 12;
        Recharge recharge = FlowRechargeChannelEnum.MDK.getRecharge();
        System.out.println(JSON.toJSONString(recharge.recharge(phone,productId)));

        recharge = FlowRechargeChannelEnum.RM.getRecharge();
        System.out.println(JSON.toJSONString(recharge.recharge(phone,productId)));

        recharge = FlowRechargeChannelEnum.JX.getRecharge();
        System.out.println(JSON.toJSONString(recharge.recharge(phone,productId)));

    }
}
