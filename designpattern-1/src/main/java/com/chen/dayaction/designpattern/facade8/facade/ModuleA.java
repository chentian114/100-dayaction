package com.chen.dayaction.designpattern.facade8.facade;

public class ModuleA {
    /**
     * 提供给子系统外部使用的方法
     */
    public void a1(){
        System.out.println("a1");
    }

    /**
     * 子系统内部模块之间相互调用时使用的方法
     */
    private void a2(){
        System.out.println("a2");
    }
    private void a3(){
        System.out.println("a3");
    }
}
