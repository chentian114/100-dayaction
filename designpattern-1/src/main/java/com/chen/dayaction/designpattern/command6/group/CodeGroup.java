package com.chen.dayaction.designpattern.command6.group;

/**
 * Created by ChenTian on 2018/10/11.
 */
public class CodeGroup extends Group{
    public void delRequirementPage(){
        System.out.println("研发组：删除一个页面需求开发！");
    }

    public void addRequirementPage(){
        System.out.println("研发组：新增一个页面需求开发！");
    }
}
