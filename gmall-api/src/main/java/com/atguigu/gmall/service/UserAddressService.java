package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

public interface UserAddressService {
    List<UserAddress> getAll();
    UserAddress getUserAddressById(String id);
    public int addUserAddress(UserAddress userAddress);
    public int updateUserAddress(UserAddress userAddress);
    public int deleteUserAddressById(String id);
}
