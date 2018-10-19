package com.vormela.config.mybatis;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter({MybatisConfig.class})
public class MybatisMapperScannerConfig {
	@Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.vormela.common.catalog.dao");
        return mapperScannerConfigurer;
    }
	@Bean
    public MapperScannerConfigurer userMapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("userSqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.vormela.common.user.dao");
        return mapperScannerConfigurer;
    }
}
