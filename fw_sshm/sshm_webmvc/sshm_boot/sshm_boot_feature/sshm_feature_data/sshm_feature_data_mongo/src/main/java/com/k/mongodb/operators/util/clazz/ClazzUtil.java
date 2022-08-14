package com.k.mongodb.operators.util.clazz;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.Field;
import java.util.List;

public class ClazzUtil {
    public static String toStr(Object obj) {
        Class clazz = obj.getClass();
        StringBuilder sb = new StringBuilder();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.getType().equals(List.class)) {
                List list = null;
                try {
                    list = (List) PropertyUtils.getProperty(obj, field.getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (list != null) {
                    for (Object object : list) {
                        sb.append(field.getName() + ":");
                        sb.append(object);
                        sb.append("\r\n");
                    }
                }
            } else {
                try {
                    sb.append(field.getName() + ":");
                    sb.append(BeanUtils.getProperty(obj, field.getName()));
                    sb.append("\r\n");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }
}
