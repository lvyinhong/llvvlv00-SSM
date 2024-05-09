package com.llvvlv00.spring.controller;

import com.llvvlv00.spring.service.UserService;
import com.llvvlv00.spring.service.impl.UserServiceImpl;

/**
 * @Package com.llvvlv00.spring.controller
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class UserController {
    private UserService userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
    public void saveUser() {
        userService.saveUser();
    }

}
