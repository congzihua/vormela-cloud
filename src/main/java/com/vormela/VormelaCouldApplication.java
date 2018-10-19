package com.vormela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
/**
 * 
 * @ClassName:  ShangDongApplication   
 * @Description:TODO(主程序启动类)   
 * @author: czh
 * @date:   2018年10月19日 上午10:15:19   
 *     
 * @Copyright: 2018 www.vormela.com Inc. All rights reserved. 
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目
 */


@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan // 开启通用注解扫描
public class VormelaCouldApplication  {
	public static void main(String[] args) {
		SpringApplication.run(VormelaCouldApplication.class, args);
	}
	 /**
     * 配置FastJson解析,不配置会用默认的jackjson工具
     * @return
     */
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.WriteMapNullValue);
		fastConverter.setFastJsonConfig(fastJsonConfig);
		HttpMessageConverter<?> converter = fastConverter;
		return new HttpMessageConverters(converter);
	}
}
