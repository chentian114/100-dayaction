package com.chen.dayaction.designpattern.template9.template;

public class ConcreteTemplate1 extends AbstractTemplate {
    @Override
    protected void abstractMethod() {
        System.out.println(this.getClass().getName()+" concrete base method....");
    }

    @Override
    protected void hookMethod() {
        System.out.println(this.getClass().getName()+" concrete hook method....");
    }
}
