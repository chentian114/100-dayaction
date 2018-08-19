package com.chen.dayaction.designpattern.strategy1.flowrecharge;

public class JXRecharge implements Recharge {
    public RechargeState recharge(String phone,long productId){
        System.out.println("拼命请求极信冲值中......");
        return new RechargeState(0,"冲值成功");
    }
}
