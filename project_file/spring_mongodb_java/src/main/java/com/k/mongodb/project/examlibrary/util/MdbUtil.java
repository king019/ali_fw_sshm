package com.k.mongodb.project.examlibrary.util;
import com.mongodb.WriteResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.data.mongodb.core.query.Query;
public class MdbUtil {
  public static Integer mongodbResultCheck(WriteResult writeResult, Map map) {
    Integer flag_int = 0;
    int object = writeResult.getN();
    if (object == 1) {
      flag_int = 1;
    }
    if (map != null) {
      map.put(SysProperty.flagKey, flag_int);
    }
    return flag_int;
  }
  public static String mongodbResultCheckStr(WriteResult writeResult, String msg) {
    StringBuilder sb = new StringBuilder(msg);
    int object = writeResult.getN();
    if (object == 1) {
      sb.append("成功");
    } else {
      sb.append("失败");
    }
    return sb.toString();
  }
  public static Integer mongodbResultCheckList(List<WriteResult> writeResults, Map map, List<String> strs) {
    List<Integer> ints = new ArrayList<>();
    WriteResult wr;
    Integer mret;
    Integer ret = 1;
    StringBuilder sb = new StringBuilder();
    for (int i = 0, num = writeResults.size(); i < num; i++) {
      wr = writeResults.get(i);
      mret = mongodbResultCheck(wr, null);
      ints.add(mret);
      ret = ret & mret;
      sb.append(strs.get(i));
    }
    map.put(SysProperty.flagKey, ret);
    map.put(SysProperty.msgKey, sb.toString());
    return ret;
  }
  public static Integer mongodbResultCheck(WriteResult writeResult) {
    return mongodbResultCheck(writeResult, null);
  }
  public static void mongodbPageUtil(Query query, Integer pageNo, Integer pageSize) {
    query.skip((pageNo - 1) * pageSize);
    query.limit(pageSize);
  }
}
