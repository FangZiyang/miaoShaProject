package com.imooc.miaoshaproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/user")//用来被spring扫描到
@RequestMapping("/user")// url地址栏的东西
public class UserController {

    @RequestMapping("/get")
    public void getUser(@RequestParam(mane = "id") Integer id) {
        // 通过id 返回用户信息给前端

    }
}
