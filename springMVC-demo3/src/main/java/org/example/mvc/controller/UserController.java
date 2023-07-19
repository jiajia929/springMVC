package org.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class UserController {
    /**
     *  使用RESTFul模拟用户资源的增删改查
     *  /user        GET     查询所有用户信息
     *  /user/1      GET     根据用户id查询用户信息
     *  /user        POST    添加用户信息
     *  /user/1      DELETE  删除用户信息
     *  /user        PUT     修改用户信息
     */

    @GetMapping("/user")
    public String getAllUser() {
        System.out.println("查询所有用户信息");
        return "success";
    }

    @GetMapping("/user/{id}")
    public String getUserById() {
        System.out.println("根据用户id查询用户信息");
        return "success";
    }

    @PostMapping("/user")
    public String insertUser(String username,String password) {
        System.out.println("添加用户信息：" + username + "," + password);
        return "success";
    }

    @PutMapping("/user")
    public String updateUser(String username,String password) {
        System.out.println("修改用户信息：" + username + "," + password);
        return "success";
    }
}
