package com.llvvlv00.spring.dao.impl;

import com.llvvlv00.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Package com.llvvlv00.spring.dao.impl
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存用户信息成功");
    }
}
