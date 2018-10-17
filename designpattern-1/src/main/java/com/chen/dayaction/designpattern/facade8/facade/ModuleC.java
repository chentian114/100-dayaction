package com.chen.dayaction.designpattern.facade8.facade;

public class ModuleC {
    /**
     * 提供给子系统外部使用的方法
     */
    public void c1(){
        System.out.println("c1");
    }

    /**
     * 子系统内部模块之间相互调用时使用的方法
     */
    private void c2(){
        System.out.println("c2");
    }
    private void c3(){
        System.out.println("c3");
    }
}
