package com.k.util.jc;
import com.k.mongo.vo.Persion;
import java.lang.reflect.Field;
public class BeanString {
  public static String beanToStr(Object obj) {
    StringBuilder sb = new StringBuilder();
    Class clazz = obj.getClass();
    Field[] fs = clazz.getDeclaredFields();
    for (Field f : fs) {
      sb.append(f.getName());
      sb.append(" ");
      try {
        f.setAccessible(true);
        if (f.get(obj) != null && f.get(obj).getClass().equals(Persion.class)) {
          sb.append(f.get(obj).getClass().equals(Persion.class));
        } else {
          sb.append(f.get(obj));
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
      sb.append("   ");
    }
    // sb.append("\n\r");
    return sb.toString();
  }
  public void test() {
    Persion p = new Persion();
    StringBuilder sb = new StringBuilder();
    Class clazz = p.getClass();
    Field[] fs = clazz.getDeclaredFields();
    for (Field f : fs) {
      sb.append(p.getName());
      sb.append("\n\r");
      try {
        sb.append(f.get(p).toString());
      } catch (Exception e) {
        e.printStackTrace();
      }
      sb.append("\n\r");
    }
  }
}
