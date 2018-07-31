package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public UserInfo getUserById(String id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addUser(String nickName) {
        UserInfo userInfo = new UserInfo();
        userInfo.setNickName(nickName);
        return userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public int updateUser(UserInfo userInfo) {
        return userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public int deleteUserById(String id) {
        return userInfoMapper.deleteByPrimaryKey(id);
    }
}
