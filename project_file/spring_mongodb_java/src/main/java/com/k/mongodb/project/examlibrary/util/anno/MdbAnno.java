package com.k.mongodb.project.examlibrary.util.anno;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MdbAnno {
  public String sortby() default "";
  public String id() default "";
}
