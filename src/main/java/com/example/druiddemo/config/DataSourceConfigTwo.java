package com.example.druiddemo.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.example.druiddemo.mapper.source2", sqlSessionTemplateRef = "mysqlSqlSessionTemplateTwo")
public class DataSourceConfigTwo {
    //    @Primary
    @Bean(name = "mysqlDBTwo")
    @ConfigurationProperties(prefix = "spring.datasource.druid.mysql-db2")
    public DataSource mysqlDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    //    @Primary
    @Bean(name = "mysqlSqlSessionFactoryTwo")
    public SqlSessionFactory mysqlSqlSessionFactory(@Qualifier("mysqlDBTwo") DataSource dataSource, org.apache.ibatis.session.Configuration config)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        SqlSessionFactory sqlSessionFactory = bean.getObject();
        sqlSessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true);
        return sqlSessionFactory;
    }

    //    @Primary
    @Bean(name = "mysqlTransactionManagerTwo")
    public DataSourceTransactionManager mysqlTransactionManager(
            @Qualifier("mysqlDBTwo") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    //    @Primary
    @Bean(name = "mysqlSqlSessionTemplateTwo")
    public SqlSessionTemplate mysqlSqlSessionTemplate(
            @Qualifier("mysqlSqlSessionFactoryTwo") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
