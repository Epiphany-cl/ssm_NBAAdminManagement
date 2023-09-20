package com.lina.mapper;

import com.lina.pojo.Adminrole;
import com.lina.pojo.AdminroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminroleMapper {
    long countByExample(AdminroleExample example);

    int deleteByExample(AdminroleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(Adminrole record);

    int insertSelective(Adminrole record);

    List<Adminrole> selectByExample(AdminroleExample example);

    Adminrole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") Adminrole record, @Param("example") AdminroleExample example);

    int updateByExample(@Param("record") Adminrole record, @Param("example") AdminroleExample example);

    int updateByPrimaryKeySelective(Adminrole record);

    int updateByPrimaryKey(Adminrole record);
}