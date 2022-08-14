package com.k.web.mybatis.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.executor.statement.StatementHandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class UtilPlugin {
    public static void main(String[] args) throws Exception {
        List<Class> list = new ArrayList<Class>();
        list.add(Executor.class);
        list.add(ParameterHandler.class);
        list.add(ResultSetHandler.class);
        list.add(StatementHandler.class);
        for (Class class1 : list) {
            cz(class1);
        }
    }

    public static void cz(Class clazz) throws Exception {
        // Class<Executor> clazz = Executor.class;
        Method[] mts = clazz.getDeclaredMethods();
        for (Method mt : mts) {
            Class[] ms = mt.getParameterTypes();
            prit(clazz, mt, ms);
        }
    }

    public static void prit(Class clazz, Method mt, Class[] ms) throws Exception {
        if (mt.getName().equals("close")) {
            log.info("1");
        }
        StringBuilder sb = new StringBuilder();
        for (Class m : ms) {
            sb.append("," + m.getSimpleName() + ".class");
        }
        if (ms.length == 0) {
            sb.append(",");
        }
        File dir = new File("temp/plugins/" + clazz.getSimpleName().toLowerCase());
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File f = new File("temp/plugins/" + clazz.getSimpleName().toLowerCase() + "/" + clazz.getSimpleName() + "_" + mt.getName() + "_plugin.java");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write("\n\r");
        bw.write("package com.k.web.mybatis.plugins." + clazz.getSimpleName().toLowerCase() + ";");
        bw.write("\n\r");
        bw.write("import java.util.Properties;");
        bw.write("\n\r");
        bw.write("import org.apache.ibatis.executor.Executor;");
        bw.write("\n\r");
        bw.write("import org.apache.ibatis.mapping.MappedStatement;");
        bw.write("\n\r");
        bw.write("import org.apache.ibatis.plugin.Interceptor;");
        bw.write("\n\r");
        bw.write("import org.apache.ibatis.plugin.Intercepts;");
        bw.write("\n\r");
        bw.write("import org.apache.ibatis.plugin.Invocation;");
        bw.write("\n\r");
        bw.write("import org.apache.ibatis.plugin.Plugin;");
        bw.write("\n\r");
        bw.write("import org.apache.ibatis.plugin.Signature;");
        bw.write("\n\r");
        bw.write("@Intercepts({@Signature(type =" + clazz.getSimpleName() + ".class, method = \"" + mt.getName() + "\"   , args = {" + sb.substring(1) + "})})");
        bw.write("\n\r");
        bw.write("public class " + clazz.getSimpleName() + "_" + mt.getName() + "_plugin" + "  implements Interceptor {");
        bw.write("\n\r");
        bw.write(" @Override");
        bw.write("\n\r");
        bw.write(" public Object intercept(Invocation invocation) throws Throwable {");
        bw.write("\n\r");
        bw.write(" return invocation.proceed();");
        bw.write("\n\r");
        bw.write("\n\r");
        bw.write(" }");
        bw.write("\n\r");
        bw.write(" @Override");
        bw.write("\n\r");
        bw.write(" public Object plugin(Object target) {");
        bw.write("\n\r");
        bw.write("return Plugin.wrap(target, this);");
        bw.write("\n\r");
        bw.write("}");
        bw.write("\n\r");
        bw.write(" @Override");
        bw.write("\n\r");
        bw.write(" public void setProperties(Properties properties) {");
        bw.write("\n\r");
        bw.write(" }");
        bw.write("\n\r");
        bw.write("}");
        bw.close();
    }
}
