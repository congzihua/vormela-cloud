package com.vormela.common.catalog.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface AdvertMapper {
   /**
    * 通过sql查询结果
    * @param sql
    * @return
    */
   public List<Map> selectList(@Param(value = "sql")String sql);
}