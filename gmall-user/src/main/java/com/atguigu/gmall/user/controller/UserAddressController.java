package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userAddress")
public class UserAddressController {
    @Autowired
    private UserAddressService userAddressService;

    @RequestMapping("/{id}")
    public UserAddress getUserAddressById(@PathVariable("id") String id) {
        return userAddressService.getUserAddressById(id);
    }

    @RequestMapping("/listAll")
    public List<UserAddress> getAll() {
        return userAddressService.getAll();
    }

    @RequestMapping("/add")
    public String addUserAddress(UserAddress userAddress) {
        userAddressService.addUserAddress(userAddress);
        return "新增成功！";
    }

    @RequestMapping("/update")
    public String updateAddress(UserAddress userAddress) {
        userAddressService.updateUserAddress(userAddress);
        return "更新成功！";
    }

    @RequestMapping("/delete/{id}")
    public String deleteUserAddressById(@PathVariable("id") String id) {
        userAddressService.deleteUserAddressById(id);
        return "删除成功";
    }
}