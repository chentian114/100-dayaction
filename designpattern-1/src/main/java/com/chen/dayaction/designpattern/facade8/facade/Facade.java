package com.chen.dayaction.designpattern.facade8.facade;

public class Facade {
    private ModuleA moduleA = new ModuleA();
    private ModuleB moduleB = new ModuleB();
    private ModuleC moduleC = new ModuleC();

    public void a1(){
        moduleA.a1();
    }

    public void b1(){
        moduleB.b1();
    }

    public void c1(){
        moduleC.c1();
    }
}
