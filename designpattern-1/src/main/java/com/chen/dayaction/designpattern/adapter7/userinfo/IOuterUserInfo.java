package com.chen.dayaction.designpattern.adapter7.userinfo;

import java.util.Map;

/**
 * 待适配接口
 */
public interface IOuterUserInfo {
    public Map<String,String> getUserBaseInfo();
    public Map<String,String> getUserOfficeInfo();
    public Map<String,String> getUserHomeInfo();

}
