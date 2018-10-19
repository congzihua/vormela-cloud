package com.vormela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

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
	@Bean
    public org.springframework.web.filter.CorsFilter corsFilter() {
      final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
      final CorsConfiguration config = new CorsConfiguration();
      config.setAllowCredentials(true); // 允许cookies跨域
      config.addAllowedOrigin("*");// #允许向该服务器提交请求的URI，*表示全部允许，在SpringMVC中，如果设成*，会自动转成当前请求头中的Origin
      config.addAllowedHeader("*");// #允许访问的头信息,*表示全部
      config.addAllowedMethod("*");// 允许提交请求的方法，*表示全部允许
      config.setMaxAge(18000L);// 预检请求的缓存时间（秒），即在这个时间段里，对于相同的跨域请求不会再预检了
      source.registerCorsConfiguration("/**", config);
      return new org.springframework.web.filter.CorsFilter(source);
    }
    @Bean
	public MultipartResolver multipartResolver(){
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setDefaultEncoding("UTF-8");
		resolver.setResolveLazily(true);
		resolver.setMaxInMemorySize(40960);
		resolver.setMaxUploadSize(50*1024*1024);//上传文件大小 50M 50*1024*1024
		return resolver;
    }
}
