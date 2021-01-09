package com.k.sshm.boot.cloud.alibaba.sentinel.apollo.model;

import com.alibaba.csp.sentinel.datasource.ReadableDataSource;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ApolloConfig {
    @PostConstruct
    private void init() {
        String namespaceName = "application";
        String flowRuleKey = "flowRules";
        // It's better to provide a meaningful default value.
        String defaultFlowRules = "[]";
        ReadableDataSource<String, List<FlowRule>> flowRuleDataSource = new ApolloDataSource<>(namespaceName,
                flowRuleKey, defaultFlowRules, source -> JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
        }));
        FlowRuleManager.register2Property(flowRuleDataSource.getProperty());
    }
}
