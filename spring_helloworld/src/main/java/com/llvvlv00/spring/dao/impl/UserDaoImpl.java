package com.llvvlv00.spring.dao.impl;

import com.llvvlv00.spring.dao.UserDao;

/**
 * @Package com.llvvlv00.spring.dao.impl
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
