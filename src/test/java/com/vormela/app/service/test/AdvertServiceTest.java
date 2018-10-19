package com.vormela.app.service.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vormela.VormelaCouldApplication;
import com.vormela.app.service.IAdvertService;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = VormelaCouldApplication.class)
public class AdvertServiceTest {
	@Autowired
	private IAdvertService advertService;
	@Test
	public void selectList(){
		List<Map> rel = advertService.selectList("select * from t_advert where id =1");
		TestCase.assertNotNull(rel);
	}
}
