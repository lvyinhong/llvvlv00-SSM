package com.llvvlv00.mybatis.test;

import com.llvvlv00.mybatis.mapper.EmpMapper;
import com.llvvlv00.mybatis.pojo.Emp;
import com.llvvlv00.mybatis.pojo.EmpExample;
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
public class MBGTest {

    @Test
    public void testMBG() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //根据id查询数据
        /*Emp emp = mapper.selectByPrimaryKey(1);
        System.out.println("emp = " + emp);*/

        //查询所有数据
       /* List<Emp> list = mapper.selectByExample(null);
        list.forEach(System.out::println);*/
        EmpExample example = new EmpExample();

        // 根据条件查询数据
        /*  example.createCriteria()
                .andEmpNameEqualTo("张三")
                .andAgeGreaterThanOrEqualTo(20);
        example.or().andGenderEqualTo("男");
        List<Emp> emps = mapper.selectByExample(example);
        System.out.println("emps = " + emps);*/

        //测试普通修改功能
        Emp emp = new Emp(1, "小黑", null, "女", 2);
        mapper.updateByPrimaryKey(emp);

        //测试选择性修改
        mapper.updateByPrimaryKeySelective(emp);
    }
}
