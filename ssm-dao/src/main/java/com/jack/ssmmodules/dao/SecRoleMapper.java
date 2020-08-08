package com.jack.ssmmodules.dao;

import com.jack.ssmmodules.pojo.SecRole;
import com.jack.ssmmodules.pojo.SecRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecRoleMapper {
    long countByExample(SecRoleExample example);

    int deleteByExample(SecRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(SecRole record);

    int insertSelective(SecRole record);

    List<SecRole> selectByExample(SecRoleExample example);

    SecRole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") SecRole record, @Param("example") SecRoleExample example);

    int updateByExample(@Param("record") SecRole record, @Param("example") SecRoleExample example);

    int updateByPrimaryKeySelective(SecRole record);

    int updateByPrimaryKey(SecRole record);
}