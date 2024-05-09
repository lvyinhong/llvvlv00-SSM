package com.llvvlv00.spring.service.impl;

import com.llvvlv00.spring.dao.UserDao;
import com.llvvlv00.spring.dao.impl.UserDaoImpl;
import com.llvvlv00.spring.service.UserService;

/**
 * @Package com.llvvlv00.spring.service.impl
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }

}
