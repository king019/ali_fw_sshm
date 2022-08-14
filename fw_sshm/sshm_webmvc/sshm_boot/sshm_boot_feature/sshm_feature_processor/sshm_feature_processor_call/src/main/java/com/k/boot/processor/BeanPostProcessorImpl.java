package com.k.boot.processor;

import com.k.boot.anno.CheckAccessType;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

@Service
public class BeanPostProcessorImpl implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            CheckAccessType access = field.getAnnotation(CheckAccessType.class);
            if (Objects.nonNull(access)) {
                if (field.getType().isAssignableFrom(Map.class)) {
                    try {
                        field.setAccessible(true);
                        Map<String, Object> map = (Map<String, Object>) field.get(bean);
                        for (Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator(); it.hasNext(); ) {
                            Map.Entry<String, Object> item = it.next();
                            Object o = item.getValue();
                            CheckAccessType annotation = o.getClass().getAnnotation(CheckAccessType.class);
                            if (Objects.nonNull(annotation) && !annotation.type().equals(access.type())) {
                                it.remove();
                            }
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return bean;
    }
}
