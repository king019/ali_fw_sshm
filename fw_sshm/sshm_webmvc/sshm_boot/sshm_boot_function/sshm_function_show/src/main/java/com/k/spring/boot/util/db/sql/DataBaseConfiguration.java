package com.k.spring.boot.util.db.sql;

import com.k.spring.boot.util.BootProperty;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class DataBaseConfiguration {
    private static Logger log = LoggerFactory.getLogger(DataBaseConfiguration.class);

    public void writeDataSource(BootProperty bootProperty) {
        log.info("", bootProperty);
    }
}
