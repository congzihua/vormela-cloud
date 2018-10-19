package com.vormela.app.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vormela.app.service.IAdvertService;
import com.vormela.common.catalog.dao.AdvertMapper;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class AdvertServiceImpl implements IAdvertService{
	@Autowired
	private AdvertMapper advertMapper;
	public List<Map> selectList(String sql){
		log.info("【IAdvertService】【selectList】查询列表");
		return advertMapper.selectList(sql);
	}
}
