package com.k.db.shardingjdbc.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.transaction.managed.ManagedTransactionFactory;
import org.apache.shardingsphere.api.config.masterslave.LoadBalanceStrategyConfiguration;
import org.apache.shardingsphere.api.config.masterslave.MasterSlaveRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.ShardingRuleConfiguration;
import org.apache.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Configuration
@MapperScan(basePackages = "com.k.db.shardingjdbc.dao", sqlSessionFactoryRef = "sqlSessionFactory")
public class DataSourceConfig {
    @Resource(name = "mysqlDs0")
    private DataSource ds0;
    @Resource(name = "mysqlDs1")
    private DataSource ds1;

    @Bean(name = "sqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier(value = "sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean("shardDataSource")
    public DataSource shardDataSource() throws SQLException {
        // 配置真实数据源
        Map<String, DataSource> dataSourceMap = new HashMap<>();
        // 配置分片规则
        ShardingRuleConfiguration config = new ShardingRuleConfiguration();
        dataSourceMap.put("ds_0", ds0);
        dataSourceMap.put("ds_1", ds1);
        LoadBalanceStrategyConfiguration strategy = new LoadBalanceStrategyConfiguration("ROUND_ROBIN");
        MasterSlaveRuleConfiguration masterSlave = new MasterSlaveRuleConfiguration("ds", "ds_0", List.of("ds_1"), strategy);
        config.setMasterSlaveRuleConfigs(List.of(masterSlave));
        return ShardingDataSourceFactory.createDataSource(dataSourceMap, config, new Properties());
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean(@Qualifier("shardDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setTransactionFactory(new ManagedTransactionFactory());
        return bean.getObject();
    }

}
