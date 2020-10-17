package com.gng.geans.app.web.controller;

import com.gng.geans.app.service.IUserService;
import com.gng.geans.app.vo.User;
import com.gng.geans.common.api.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/test.do")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping(value = "/queryUserList.do")
    @ResponseBody
    public CommonResult<List<User>> queryUserList() {
        return userService.queryUserList();
    }

    @GetMapping(value = "/queryUserById.do")
    @ResponseBody
    public CommonResult<User> queryUserById(@RequestParam Long userId) {
        return userService.queryUserById(userId);
    }
}
