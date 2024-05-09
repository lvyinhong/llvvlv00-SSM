package com.llvvlv00.spring.controller;

import com.llvvlv00.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Package PACKAGE_NAME
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
@Controller
public class UserController {

    @Autowired
    public UserService userService;

    /**
     * @Description 保存用户
     */
    public void saveUser() {
        userService.saveUser();
    }
}
