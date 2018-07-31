package com.atguigu.gmall.user.service.impl;


import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserAddressService;
import com.atguigu.gmall.user.mapper.UserAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAddressServiceImpl implements UserAddressService {
    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserAddress> getAll() {
        return userAddressMapper.selectAll();
    }

    @Override
    public UserAddress getUserAddressById(String id) {
        return userAddressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addUserAddress(UserAddress userAddress) {
        return userAddressMapper.insertSelective(userAddress);
    }

    @Override
    public int updateUserAddress(UserAddress userAddress) {
        return userAddressMapper.updateByPrimaryKeySelective(userAddress);
    }

    @Override
    public int deleteUserAddressById(String id) {
        return userAddressMapper.deleteByPrimaryKey(id);
    }
}
