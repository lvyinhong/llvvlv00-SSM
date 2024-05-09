package com.llvvlv00.mybatis;

import com.llvvlv00.mybatis.mapper.SpecialSQLMapper;
import com.llvvlv00.mybatis.mapper.UserMapper;
import com.llvvlv00.mybatis.pojo.User;
import com.llvvlv00.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Package com.llvvlv00.mybatis
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class SpecialSQLMapperTest {
    @Test
    public void testGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserByLike("a");
        System.out.println("list = " + list);
        sqlSession.close();
    }

    @Test
    public void testDeleteMoreUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.deleteMoreUser("4,5");
        sqlSession.close();
    }

    @Test
    public void testGetUserList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> user = mapper.getUserList("User");
        user.forEach(System.out::println);
        sqlSession.close();
    }

    /**
     * 添加功能,返回自增的主键
     */
    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null,"xiaoming","123456",24,"男","123@qq.com");
        mapper.insertUser(user);
        System.out.println("user = " + user);
    }
}
