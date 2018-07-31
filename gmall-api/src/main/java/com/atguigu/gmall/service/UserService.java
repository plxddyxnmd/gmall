package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

public interface UserService {
    List<UserInfo> getAll();
    UserInfo getUserById(String id);
    public int addUser(String nickName);
    public int updateUser(UserInfo userInfo);
    public int deleteUserById(String id);
}
