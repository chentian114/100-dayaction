package com.chen.dayaction.designpattern.factory4.computer;

/**
 * Created by ChenTian on 2018/9/11.
 */
public interface AbstractFactory {
    public Cpu createCpu();
    public Mainboard createMainboard();
}
