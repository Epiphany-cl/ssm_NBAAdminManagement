package com.lina.mapper;

import com.lina.pojo.Gametype;
import com.lina.pojo.GametypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GametypeMapper {
    long countByExample(GametypeExample example);

    int deleteByExample(GametypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(Gametype record);

    int insertSelective(Gametype record);

    List<Gametype> selectByExample(GametypeExample example);

    Gametype selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") Gametype record, @Param("example") GametypeExample example);

    int updateByExample(@Param("record") Gametype record, @Param("example") GametypeExample example);

    int updateByPrimaryKeySelective(Gametype record);

    int updateByPrimaryKey(Gametype record);
}