package com.k.adapter;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Filter;

import java.util.List;

public class FilterCache {
    public static void main(String[] args) {
        ExtensionLoader<Filter> loader = ExtensionLoader.getExtensionLoader(Filter.class);
        URL url = new URL("", "", 0);
        url = url.addParameter("cache", "cache");
        List<Filter> filters = loader.getActivateExtension(url, "cache");
        System.out.println(filters.size());
        filters.forEach(filter -> {
            System.out.println(filter);
        });
    }
}