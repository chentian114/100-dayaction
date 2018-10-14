package com.chen.dayaction.designpattern.adapter7;

import com.chen.dayaction.designpattern.adapter7.userinfo.IOuterUserInfo;
import com.chen.dayaction.designpattern.adapter7.userinfo.IUserInfo;
import com.chen.dayaction.designpattern.adapter7.userinfo.OuterUserInfo;
import com.chen.dayaction.designpattern.adapter7.userinfo.OuterUserInfoAdapter;

/**
 * 公司员工信息案例：
 *  人公司员信息系统管理所有员工的所有信息：用户姓名、家庭地址、办公电话、职位等。
 *  现在系统升级要能够管理公司借用的劳务公司人员信息，劳动服务公司是把人员信息分为：基本信息、办公信息和个人家庭信息。
 * 适配器模式优点：
 *     1）适配器模式可以让两个没有任何关系的类在一起运行。
 *     2）增加了类的透明性，访问的是Target目标角色，实际具体实现委托给了Adaptee源角色，而这些对高层模块调用者是透明的。
 *     3）提高了类的复用度，源角色在原有系统可以正常使用，在目标角色中也可以使用。
 *     4）灵活性好，当不需要这个适配器时，删除这个适配器即可。
 *  使用场景：
 *      修改一个已经投产中的接口时，适配器模式可能是最适合你的模式。比如系统扩展了，需要使用一个已有或新建立的类，但这个类又不符合系统的接口。
 *  注意事项：
 *      适配器模式最好在详细设计阶段不要考虑它，它不是为了解决还处在开发阶段的问题,而是解决正在服役的项目问题。
 *
 *
 */
public class UserInfoDemo {
    public static void main(String[] args) {
        IOuterUserInfo outerUserInfo = new OuterUserInfo();

        IUserInfo userInfo = new OuterUserInfoAdapter(outerUserInfo);
        userInfo.getUserName();
        userInfo.getHomeAddress();
        userInfo.getOfficePhone();
        userInfo.getJobPosition();

    }

}
