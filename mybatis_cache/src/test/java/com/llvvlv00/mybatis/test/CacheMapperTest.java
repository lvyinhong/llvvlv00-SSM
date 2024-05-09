package com.llvvlv00.mybatis.test;

import com.llvvlv00.mybatis.mapper.CacheMapper;
import com.llvvlv00.mybatis.pojo.Emp;
import com.llvvlv00.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Package com.llvvlv00.mybatis.test
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public class CacheMapperTest {
    /**
     * MyBatis的一级缓存
     * 是SqlSession级别的，通过同一个SqlSession查询的数据会被缓存,再次使用同一个SqlSession
     * 查询相同select语句会从缓存中获取
     * 使一级缓存失效的四中情况
     * 1) 不同的SqlSession对应不同的一级缓存
     * 2) 同一个SqlSession但是查询条件不同
     * 3) 同一个SqlSession两次查询期间执行了任何一次增删该操作
     * 4) 同一个SqlSession两次查询期间手动清理了缓存  sqlSession.clearCache();
     */
    @Test
    public void testGetEmpById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp1 = mapper.getEmpById(1);
        System.out.println("emp1 = " + emp1);
        Emp emp2 = mapper.getEmpById(1);
        System.out.println("emp2 = " + emp2);
        SqlSession sqlSession2 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp3 = mapper2.getEmpById(1);
        System.out.println("emp3 = " + emp3);
    }

    /**
     * MyBatis的二级缓存
     * 是SqlSessionFactory级别的,
     *  既通过同一个SqlSessionFactory所获取的sqlSession查询的数据会被缓存
     *  再次通过同一个SqlSessionFactory所获取的sqlSession查询相同的数据会从缓存中获取
     * MyBatis二级缓存开启的条件
     * 1、在核心配置文件中设置全局属性cacheEnabled="true",默认true不需要设置
     * 2、在映射文件中设置标签<cache />
     * 3、二级缓存必须在SqlSession关闭或提交之后有效
     *
     * 使二级缓存失效的情况
     *  两次查询期间执行了任何一次增删该操作,会使一级和二级缓存同时失效
     * @throws IOException
     */
    @Test
    public void testCache() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
        SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpById(2);
        System.out.println("emp1 = " + emp1);
        sqlSession1.close();

        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp2 = mapper2.getEmpById(2);
        System.out.println("emp2 = " + emp2);
        sqlSession2.close();

    }
}
