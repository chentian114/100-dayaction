package com.chen.dayaction.designpattern.strategy1.flowrecharge;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RechargeState {
    private int resultCode;
    private String resultMsg;
    private String resultData;

    public RechargeState(int resultCode,String resultMsg){
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }
    public RechargeState(int resultCode,String resultMsg,String resultData){
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.resultData = resultData;
    }

}
