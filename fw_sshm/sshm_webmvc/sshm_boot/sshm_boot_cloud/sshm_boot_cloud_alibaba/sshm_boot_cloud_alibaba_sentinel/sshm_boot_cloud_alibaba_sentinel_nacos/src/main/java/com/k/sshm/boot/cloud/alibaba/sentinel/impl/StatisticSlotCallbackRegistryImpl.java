package com.k.sshm.boot.cloud.alibaba.sentinel.impl;

import com.alibaba.csp.sentinel.context.Context;
import com.alibaba.csp.sentinel.node.DefaultNode;
import com.alibaba.csp.sentinel.slotchain.ProcessorSlotEntryCallback;
import com.alibaba.csp.sentinel.slotchain.ProcessorSlotExitCallback;
import com.alibaba.csp.sentinel.slotchain.ResourceWrapper;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.statistic.StatisticSlotCallbackRegistry;

public class StatisticSlotCallbackRegistryImpl {


    public void test() {
        StatisticSlotCallbackRegistry.addEntryCallback(",", new ProcessorSlotEntryCallback<DefaultNode>() {
            @Override
            public void onPass(Context context, ResourceWrapper resourceWrapper, DefaultNode param, int count, Object... args) throws Exception {

            }

            @Override
            public void onBlocked(BlockException ex, Context context, ResourceWrapper resourceWrapper, DefaultNode param, int count, Object... args) {

            }
        });
        StatisticSlotCallbackRegistry.addExitCallback("", new ProcessorSlotExitCallback() {
            @Override
            public void onExit(Context context, ResourceWrapper resourceWrapper, int count, Object... args) {

            }
        });
    }
}
