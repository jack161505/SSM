package com.jack.ssmmodules.dao;

import com.jack.ssmmodules.pojo.SecUser;
import com.jack.ssmmodules.pojo.SecUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecUserMapper {
    long countByExample(SecUserExample example);

    int deleteByExample(SecUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(SecUser record);

    int insertSelective(SecUser record);

    List<SecUser> selectByExample(SecUserExample example);

    SecUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") SecUser record, @Param("example") SecUserExample example);

    int updateByExample(@Param("record") SecUser record, @Param("example") SecUserExample example);

    int updateByPrimaryKeySelective(SecUser record);

    int updateByPrimaryKey(SecUser record);

    List<SecUser> selectAll();
}