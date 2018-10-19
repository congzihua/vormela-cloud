package com.vormela.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vormela.app.service.IAdvertService;
import com.vormela.common.constant.ReturnCodesEnum;
import com.vormela.common.response.RespJson;

@RestController
@RequestMapping("/ad")
public class AdvertController {
	@Autowired
	private IAdvertService advertService;
	@GetMapping("/seleList")
	public RespJson getInfo(){
		List rel = advertService.selectList("select * from t_advert where id =1");
		ReturnCodesEnum rc = ReturnCodesEnum.QUERY_SUCESS;
		return new RespJson(rel,rc.getCode(),rc.getMsg());
	}
}
