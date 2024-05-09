package com.llvvlv00.mybatis.mapper;

import com.llvvlv00.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @Package com.llvvlv00.mybatis.mapper
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public interface DeptMapper {
    /**
     * 通过分布查询查询员工以及所对应部门信息的第二步
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    /**
     * 查询部门以及部门中的员工信息
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    /**
     * 通过分布查询查询部门以及部门中的员工信息的第一步
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
