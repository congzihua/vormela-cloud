package com.vormela.app.service;

import java.util.List;
import java.util.Map;

public interface IAdvertService {
	/**
	    * 通过sql查询结果
	    * @param sql
	    * @return
	*/
    public List<Map> selectList(String sql);
}
