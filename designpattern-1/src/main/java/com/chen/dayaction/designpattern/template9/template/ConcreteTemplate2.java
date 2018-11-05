package com.chen.dayaction.designpattern.template9.template;

public class ConcreteTemplate2 extends AbstractTemplate {
    @Override
    protected void abstractMethod() {
        System.out.println(this.getClass().getName()+" concrete base method....");
    }


}
