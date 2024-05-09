package com.llvvlv00.mybatis.mapper;

import com.llvvlv00.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @Package com.llvvlv00.mybatis.mapper
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public interface CacheMapper {
    /**
     * 根据员工id查询员工信息
     * @param empId
     * @return
     */
    Emp getEmpById(@Param("empId") Integer empId);
}
