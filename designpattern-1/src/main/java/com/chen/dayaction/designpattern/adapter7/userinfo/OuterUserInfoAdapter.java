package com.chen.dayaction.designpattern.adapter7.userinfo;

public class OuterUserInfoAdapter implements IUserInfo {
    private IOuterUserInfo outerUserInfo;
    public OuterUserInfoAdapter(IOuterUserInfo outerUserInfo){
        this.outerUserInfo = outerUserInfo;
    }

    @Override
    public String getUserName() {
        String userName = outerUserInfo.getUserBaseInfo().get("userName");
        System.out.println("姓名："+userName);
        return null;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = outerUserInfo.getUserHomeInfo().get("homeAddress");
        System.out.println("家庭地址："+homeAddress);
        return null;
    }

    @Override
    public String getPhone() {
        String phone = outerUserInfo.getUserBaseInfo().get("phone");
        System.out.println("电话："+phone);
        return null;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = outerUserInfo.getUserOfficeInfo().get("jobPosition");
        System.out.println("职称："+jobPosition);
        return null;
    }

    @Override
    public String getOfficePhone() {
        String officePhone = outerUserInfo.getUserOfficeInfo().get("officePhone");
        System.out.println("办公电话："+officePhone);
        return null;
    }
}
