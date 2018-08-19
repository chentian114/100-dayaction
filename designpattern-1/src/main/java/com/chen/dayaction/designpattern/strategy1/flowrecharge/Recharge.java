package com.chen.dayaction.designpattern.strategy1.flowrecharge;

public interface Recharge {
    public RechargeState recharge(String phone,long productId);
}
