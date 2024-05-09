package com.llvvlv00.spring.factory;

import com.llvvlv00.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Package com.llvvlv00.spring.factory
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
