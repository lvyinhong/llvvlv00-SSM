package com.llvvlv00.mybatis.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Package com.llvvlv00.mybatis.com.llvvlv00.mybatis.mapper
 * @Description TODO
 * @Author llvvlv00
 * @Email llvvlv00@qq.com
 * @Version v1.0.0
 */
public interface UserMapper {
    int getCount();

    Map<String, Object> getUserByIdToMap(@Param("id") int id);
    List<Map<String, Object>> getAllUserToMap();

    @MapKey("id")
    Map<String, Object> getAllUserMap();
}
