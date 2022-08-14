package com.k.spring.hierarchy.example.factory;

import com.k.spring.hierarchy.example.base.adapter.AdapterBase;
import com.k.spring.hierarchy.example.base.factory.AdapterFactoryBase;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("adapterFactoryBaseOne")
@Lazy(true)
public class AdapterFactoryBaseOne extends AdapterFactoryBase {
    @Override
    @Resource(name = "adapterBaseImplOne")
    public void setAdapterOne(AdapterBase adapterOne) {
        super.setAdapterOne(adapterOne);
    }
}
