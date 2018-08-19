package com.chen.dayaction.designpattern.strategy1.flowrecharge;

public class RMRecharge implements Recharge {
    public RechargeState recharge(String phone,long productId){
        System.out.println("拼命请求融漫冲值中......");
        return new RechargeState(0,"冲值成功");
    }
}
