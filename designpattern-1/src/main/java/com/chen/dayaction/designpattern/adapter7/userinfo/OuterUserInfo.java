package com.chen.dayaction.designpattern.adapter7.userinfo;

import java.util.HashMap;
import java.util.Map;

public class OuterUserInfo implements IOuterUserInfo {
    @Override
    public Map<String, String> getUserBaseInfo() {
        Map<String,String> map = new HashMap<>();
        map.put("userName","石破天");
        map.put("phone","18807385566");
        return map;
    }

    @Override
    public Map<String, String> getUserOfficeInfo() {
        Map<String,String> map = new HashMap<>();
        map.put("jobPosition","程序猿");
        map.put("officePhone","0209988567");
        return map;
    }

    @Override
    public Map<String, String> getUserHomeInfo() {
        Map<String,String> map = new HashMap<>();
        map.put("homeAddress","广东省广州市天河区");
        return map;
    }
}
