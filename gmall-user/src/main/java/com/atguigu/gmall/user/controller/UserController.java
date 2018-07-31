package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.bean.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/say")
    public String say() {
        return "hello";
    }

    @RequestMapping("/{id}")
    public UserInfo getUserById(@PathVariable("id") String id) {
        return userService.getUserById(id);
    }

    @RequestMapping("/listAll")
    public List<UserInfo> getAll() {
        return userService.getAll();
    }

    @RequestMapping("/addUser")
    public String addUser(String nickName) {
        userService.addUser(nickName);
        return "添加成功！";
    }

    @RequestMapping("/updateUser")
    public String updateUser(UserInfo userInfo) {
        userService.updateUser(userInfo);
        return "更新成功！";
    }

    @RequestMapping("delete/{id}")
    public String deleteUserById(@PathVariable("id") String id) {
        userService.deleteUserById(id);
        return "删除成功！";
    }

}
