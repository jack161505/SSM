package com.jack.ssmmodules.dao;

import com.jack.ssmmodules.pojo.SecUserRole;
import com.jack.ssmmodules.pojo.SecUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecUserRoleMapper {
    long countByExample(SecUserRoleExample example);

    int deleteByExample(SecUserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SecUserRole record);

    int insertSelective(SecUserRole record);

    List<SecUserRole> selectByExample(SecUserRoleExample example);

    SecUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SecUserRole record, @Param("example") SecUserRoleExample example);

    int updateByExample(@Param("record") SecUserRole record, @Param("example") SecUserRoleExample example);

    int updateByPrimaryKeySelective(SecUserRole record);

    int updateByPrimaryKey(SecUserRole record);
}