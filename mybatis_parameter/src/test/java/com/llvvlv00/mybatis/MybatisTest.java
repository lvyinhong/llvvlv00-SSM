package com.llvvlv00.mybatis;

import com.llvvlv00.mybatis.mapper.UserMapper;
import com.llvvlv00.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @Package com.llvvlv00.mybatis
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class MybatisTest {
    @Test
    public void testCount() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int count = userMapper.getCount();
        System.out.println("count = " + count);
        sqlSession.close();
    }

    @Test
    public void testGetUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> userMap = userMapper.getUserByIdToMap(4);
        System.out.println(userMap);
        sqlSession.close();
    }

    /**
     * [
     *  {password=123456, gender=?, id=4, age=23, email=12345@qq.com, username=admin},
     *  {password=123456, gender=?, id=5, age=23, email=12345@qq.com, username=admin},
     *  {password=123456, gender=?, id=6, age=23, email=12345@qq.com, username=admin}
     * ]
     */
    @Test
    public void testGetAllUserToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Map<String, Object>> allUserToMap = userMapper.getAllUserToMap();
        System.out.println(allUserToMap);
        sqlSession.close();
    }

    /**
     * {
     *  4={password=123456, gender=?, id=4, age=23, email=12345@qq.com, username=admin},
     *  5={password=123456, gender=?, id=5, age=23, email=12345@qq.com, username=admin},
     *  6={password=123456, gender=?, id=6, age=23, email=12345@qq.com, username=admin}
     * }
     */
    @Test
    public void testGetAllUserMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> allUserMap = userMapper.getAllUserMap();
        System.out.println(allUserMap);
        sqlSession.close();
    }
}
