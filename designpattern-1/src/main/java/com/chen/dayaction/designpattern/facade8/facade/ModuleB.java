package com.chen.dayaction.designpattern.facade8.facade;

public class ModuleB {
    /**
     * 提供给子系统外部使用的方法
     */
    public void b1(){
        System.out.println("b1");
    }

    /**
     * 子系统内部模块之间相互调用时使用的方法
     */
    private void b2(){
        System.out.println("b2");
    }
    private void b3(){
        System.out.println("b3");
    }

}
