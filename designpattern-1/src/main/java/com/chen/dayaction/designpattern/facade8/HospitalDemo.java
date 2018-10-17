package com.chen.dayaction.designpattern.facade8;

import com.chen.dayaction.designpattern.facade8.hospital.HospitalFacade;

/**
 * Created by ChenTian on 2018/10/17.
 * 医院案例：
 *  一个医院有不同的职能部门：挂号、门诊、划价、化验、收费、取药等。病人看病需要和这些部门打交道，
 *  首先必须先挂号，然后门诊。如果医生要求化验，病人必须先缴费，然后化验。再回门诊药生开药，再缴费再取药。
 * 需求分析：
 *  一个医院相当于一个子系统，病人挂号、门诊等相当于与子系统中的各个类打交道。
 *  病人要与诸多部门打交道不是一件容易的事，尤其是初次到医院的不知道各部门在什么地方。
 *  在面向对象中病人类直接与子系统的类打交道会让病人类高耦合，依赖的类太多。
 *  解决方法：医院会设置一个前台接待员角色，给病人做指引。
 *  在面向对象中通过引入门面模式，用一个门面类引用子系统中的所有类，提供一个公共的接口，
 *  所有病人都只依赖门面类，通过门面类去和子系统中的各个类打交道。
 *
 *
 */
public class HospitalDemo {
    public static void main(String[] args) {
        HospitalFacade hospitalFacade = new HospitalFacade();
        hospitalFacade.seeDocket();
        System.out.println("----------------------");
        hospitalFacade.takeMedicine();
    }
}
