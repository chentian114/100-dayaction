package com.chen.dayaction.designpattern.strategy1.flowrecharge;

public class MDKRecharge implements Recharge {
    public RechargeState recharge(String phone,long productId){
        System.out.println("拼命请求麻袋氪冲值中......");
        return new RechargeState(0,"冲值成功");
    }
}
