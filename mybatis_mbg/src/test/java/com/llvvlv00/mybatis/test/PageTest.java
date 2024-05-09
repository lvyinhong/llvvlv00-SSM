package com.llvvlv00.mybatis.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.llvvlv00.mybatis.mapper.EmpMapper;
import com.llvvlv00.mybatis.pojo.Emp;
import com.llvvlv00.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Package com.llvvlv00.mybatis.test
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */

public class PageTest {
    @Test
    public void testPage() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        PageHelper.startPage(1,10);
        List<Emp> list = mapper.selectByExample(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testPageInfo() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        PageHelper.startPage(1, 1);
        List<Emp> list = mapper.selectByExample(null);

        PageInfo<Emp> pageInfo = new PageInfo<>(list,5);
        list.forEach(System.out::println);
        System.out.println("pageInfo = " + pageInfo);
    }
}
