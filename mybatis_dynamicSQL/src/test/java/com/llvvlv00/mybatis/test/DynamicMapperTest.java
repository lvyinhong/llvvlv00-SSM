package com.llvvlv00.mybatis.test;

import com.llvvlv00.mybatis.mapper.DynamicSQLMapper;
import com.llvvlv00.mybatis.pojo.Emp;
import com.llvvlv00.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Package com.llvvlv00.mybatis.test
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class DynamicMapperTest {
    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(1, "张三", 20, null,null);
        List<Emp> empList = mapper.getEmpByCondition(emp);
        empList.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testGetEmpByChoose() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "张三", null, null,null);
        List<Emp> empList = mapper.getEmpByChoose(emp);
        empList.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testInsertMoreEmp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "张三1", 23, "男",1);
        Emp emp2 = new Emp(null, "张三2", 24, "男",2);
        Emp emp3 = new Emp(null, "张三3", 25, "男",3);
        List<Emp> empList = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(empList);
        sqlSession.close();
    }


    @Test
    public void testDeleteMoreEmp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] empIds = {6, 7};
        mapper.deleteMoreEmp(empIds);
        sqlSession.close();
    }
}
