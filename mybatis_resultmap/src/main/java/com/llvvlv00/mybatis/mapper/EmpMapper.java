package com.llvvlv00.mybatis.mapper;

import com.llvvlv00.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Package com.llvvlv00.mybatis.mapper
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public interface EmpMapper {
    Emp getEmpByEmpId(@Param("empId") Integer empId);

    /**
     * 获取员工与对应的部门信息
     * @param empId
     * @return
     */
    Emp getEmpAndDept(@Param("empId") Integer empId);

    /**
     * 通过分布查询查询员工以及所对应部门信息的第一步
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    /**
     * 通过分布查询查询部门以及部门中的员工信息的第二步
     * @param deptId
     * @return
     */
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);
}
