package com.jack.ssmmodules.dao;

import com.jack.ssmmodules.pojo.SecPermission;
import com.jack.ssmmodules.pojo.SecPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecPermissionMapper {
    long countByExample(SecPermissionExample example);

    int deleteByExample(SecPermissionExample example);

    int deleteByPrimaryKey(Integer permissionId);

    int insert(SecPermission record);

    int insertSelective(SecPermission record);

    List<SecPermission> selectByExample(SecPermissionExample example);

    SecPermission selectByPrimaryKey(Integer permissionId);

    int updateByExampleSelective(@Param("record") SecPermission record, @Param("example") SecPermissionExample example);

    int updateByExample(@Param("record") SecPermission record, @Param("example") SecPermissionExample example);

    int updateByPrimaryKeySelective(SecPermission record);

    int updateByPrimaryKey(SecPermission record);
}