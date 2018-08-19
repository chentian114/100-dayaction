package com.chen.dayaction.designpattern.strategy1.flowrecharge;

/**
 * 流量冲值通道
 */
public enum FlowRechargeChannelEnum {
    MDK(new MDKRecharge()),
    RM(new RMRecharge()),
    JX(new JXRecharge());

    private Recharge recharge;
    public Recharge getRecharge(){
        return recharge;
    }
    private FlowRechargeChannelEnum(Recharge recharge){
        this.recharge = recharge;
    }
}
