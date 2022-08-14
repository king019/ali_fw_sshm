package com.k.web.mybatis.plugins.shardstrategy;
//import com.google.code.shardbatis.strategy.ShardStrategy;

import com.k.web.mybatis.model.VO;

//public class TestShardStrategyImpl implements ShardStrategy {
public class TestShardStrategyImpl {
    /**
     * 得到实际表名
     *
     * @param baseTableName 逻辑表名,一般是没有前缀或者是后缀的表名
     * @param params        mybatis执行某个statement时使用的参数
     * @param mapperId      mybatis配置的statement id
     */
    //@Override
    public String getTargetTableName(String baseTableName, Object params, String mapperId) {
        VO u = null;
        long id = 0;
        if (params instanceof VO) {
            u = (VO) params;
            id = u.getId();
        } else {
            id = Long.parseLong(String.valueOf(params));
        }
        String table = "";
        if (id % 3 == 0) {
            table = "0";
        } else if (id % 3 == 1) {
            table = "1";
        } else {
            table = "2";
        }
        return baseTableName + "_" + table;
    }
}