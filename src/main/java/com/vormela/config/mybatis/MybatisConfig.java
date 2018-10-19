package com.vormela.config.mybatis;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

@Configuration
@EnableTransactionManagement
public class MybatisConfig   implements TransactionManagementConfigurer{
	 private Logger logger=LoggerFactory.getLogger(MybatisConfig.class);
    @Autowired
    @Qualifier("dataSource")    
    private DataSource dataSource;
    @Autowired
    @Qualifier("userDataSource")    
    private DataSource userDataSource;
    @Bean(name = "sqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory() {
        try {
            SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
            sessionFactoryBean.setDataSource(dataSource);
            sessionFactoryBean.setTypeAliasesPackage("com.vormela.common.catalog.entity");
    		//对应mybatis.mapper-locations配置
            sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:com/vormela/common/catalog/mapper/*.xml"));
            sessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
            return sessionFactoryBean.getObject();
        } catch (Exception e) {
            logger.error("mybatis resolver mapper*xml is error",e);
            return null;
        } 
    }
    @Bean(name = "userSqlSessionFactory")
    public SqlSessionFactory userSqlSessionFactory() {
        try {
            SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
            sessionFactoryBean.setDataSource(userDataSource);
            
            sessionFactoryBean.setTypeAliasesPackage("com.vormela.common.user.entity");
    		//对应mybatis.mapper-locations配置  
            sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:com/vormela/common/user/mapper/*.xml"));
            sessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
            return sessionFactoryBean.getObject();
        } catch (Exception e) {
            logger.error("mybatis resolver mapper*xml is error",e);
            return null;
        } 
    }
    @Override
   	@Bean
   	public PlatformTransactionManager annotationDrivenTransactionManager() {
   	    return new DataSourceTransactionManager(dataSource);
   	 }
}
