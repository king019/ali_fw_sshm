package com.k.spring.util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class UtilDemo {
    private String filePathXml;
    @Value("#{prop['file_root']}")
    private String filePathAnno;
    // @Value("#{file_root}")错误
    private String filePathAnnoXml;
}
