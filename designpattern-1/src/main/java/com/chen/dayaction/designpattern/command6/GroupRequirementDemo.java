package com.chen.dayaction.designpattern.command6;

import com.chen.dayaction.designpattern.command6.group.AddRequirementCommand;
import com.chen.dayaction.designpattern.command6.group.DeletePageCommand;
import com.chen.dayaction.designpattern.command6.group.Invoker;

/**
 * Created by ChenTian on 2018/10/11.
 * 项目组需求案例：
 * 客户会提不同的需求到项目组如：增加一个需求、修改一项需求、删除一个页面，项目组要对这些需求进行处理。
 * 项目组分为：需求组、美工组、研发组。增加一个需求需要需求组、美工组、研发组参与。删除一个页面需要需求组与研发组删除参与。
 *
 * 需求分析：
 * 将客户需求封装成命令，客户只需要关注其所提的需求即可，而不需要关注项目组具体处理该任务的项目组内部信息。
 * 项目组长接到用户需求，对客户需求进行参数化，如：增加一个需求就是一个新增需求的命令，
 * 删除一个页面的需求就是一个删除页面的命令。命令里持有处理该任务的组目组成员的引用，
 * 并有一个统一的execute()方法调用具体项目组成员处理该需求。
 *
 * 要点总结：
 * 命令模式：将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。
 *  Receive接收者角色，处理命令
 *  Command命令角色，需要执行的请求
 *  Invoker调用者角色，接收命令，并执行命令
 * 优点：
 *  1）类间解耦，调用者角色与接收者角色之间没有任何依赖关系。
 *  2）可扩展性，Command子类可以非常容易扩展，调用者Invoker和高层次的Client不产一严重的代码耦合。
 * 缺点：
 *  1）类数量随命令数量增长而增长。可能造成类数量过多。
 * 实践：
 *  在实际Receiver一般采用封闭的方式，减少Client对Receiver的依赖。如案例中的各Group组。
 *
 */
public class GroupRequirementDemo {
    public static void main(String[] args) {
        //项目组长
        Invoker invoker = new Invoker();

        //客户新增一个页面需求
        AddRequirementCommand addCommand = new AddRequirementCommand();

        //项目组长接到需求
        invoker.setCommand(addCommand);

        //项目组长分配任务
        invoker.action();


        //客户删除一个页面需求
        DeletePageCommand delCommand = new DeletePageCommand();
        invoker.setCommand(delCommand);
        invoker.action();
    }

}
