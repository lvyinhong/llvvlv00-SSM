package com.llvvlv00.mybatis.mapper;

import com.llvvlv00.mybatis.pojo.User;

import java.util.List;

/**
 * @Package com.llvvlv00.mybatis.com.llvvlv00.mybatis.mapper
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public interface UserMapper {
    int insertUser();

    int updateUser();

    void deleteUser();

    User selectById();

    List<User> selectAll();
}
