package com.k.sshm.boot.cloud.alibaba.sentinel;

import com.alibaba.csp.sentinel.AsyncEntry;
import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SentinelTest {
    @Ignore
    @Test
    public void test() {
        // 配置规则.
        initFlowRules();

        while (true) {
            // 1.5.0 版本开始可以直接利用 try-with-resources 特性，自动 exit entry
            try (Entry entry = SphU.entry("HelloWorld")) {
                // 被保护的逻辑
                System.out.println("hello world");
            } catch (BlockException ex) {
                // 处理被流控的逻辑
                System.out.println("blocked!");
            }
        }
    }

    public void test1() {
        try {
            AsyncEntry entry = SphU.asyncEntry("");
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        // 在此处处理异步调用的结果.
                    } finally {
                        // 在回调结束后 exit.
                        entry.exit();
                    }
                }
            });

//            // 异步调用.
//            doAsync(userId, result -> {
//
//            });
        } catch (BlockException ex) {
            // Request blocked.
            // Handle the exception (e.g. retry or fallback).
        }
    }

    private static void initFlowRules() {
        List<FlowRule> rules = new ArrayList<>();
        FlowRule rule = new FlowRule();
        rule.setResource("HelloWorld");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        // Set limit QPS to 20.
        rule.setCount(20);
        rules.add(rule);
        FlowRuleManager.loadRules(rules);
    }

}
