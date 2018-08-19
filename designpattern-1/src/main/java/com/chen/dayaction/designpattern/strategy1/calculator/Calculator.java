package com.chen.dayaction.designpattern.strategy1.calculator;

public enum Calculator {
    ADD("+"){
        public int exec(int a,int b){
            return a+b;
        }
    },
    SUB("-"){
        public int exec(int a,int b){
            return a-b;
        }
    };

    private String symbol;
    public abstract int exec(int a,int b);
    private Calculator(String symbol){
        this.symbol = symbol;
    }
    public  String getSymbol(){
        return symbol;
    }
}
