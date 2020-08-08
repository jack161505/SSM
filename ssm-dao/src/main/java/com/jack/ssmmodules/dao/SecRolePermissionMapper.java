package com.jack.ssmmodules.dao;

import com.jack.ssmmodules.pojo.SecRolePermission;
import com.jack.ssmmodules.pojo.SecRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecRolePermissionMapper {
    long countByExample(SecRolePermissionExample example);

    int deleteByExample(SecRolePermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecRolePermission record);

    int insertSelective(SecRolePermission record);

    List<SecRolePermission> selectByExample(SecRolePermissionExample example);

    SecRolePermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecRolePermission record, @Param("example") SecRolePermissionExample example);

    int updateByExample(@Param("record") SecRolePermission record, @Param("example") SecRolePermissionExample example);

    int updateByPrimaryKeySelective(SecRolePermission record);

    int updateByPrimaryKey(SecRolePermission record);
}