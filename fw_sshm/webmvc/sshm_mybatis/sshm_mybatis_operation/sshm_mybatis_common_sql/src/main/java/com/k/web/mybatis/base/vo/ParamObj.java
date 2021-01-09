package com.k.web.mybatis.base.vo;
import java.io.Serializable;
/**
 * 参数传递类
 *
 * @author liwei
 */
public class ParamObj implements Serializable {
  private static final long serialVersionUID = 8408371340405783798L;
  // 所应用的sqlSessionFactory
  private String ds;
  // 执行的sqlId
  private String sqlId;
  // sql语句所需要的参数
  private Object condition;
  private String countSqlId;
  private String countSql;
  // 分页的开始记录数
  private int start;
  // 分页的结束记录数
  private int end;
  // 分页的每页限制（和PageBean中的pageSize一致）
  private int limit;
  public ParamObj() {
  }
  public int getLimit() {
    return limit;
  }
  public void setLimit(int limit) {
    this.limit = limit;
  }
  public String getDs() {
    return ds;
  }
  public void setDs(String ds) {
    this.ds = ds;
  }
  public String getSqlId() {
    return sqlId;
  }
  public void setSqlId(String sqlId) {
    this.sqlId = sqlId;
  }
  public Object getCondition() {
    return condition;
  }
  public void setCondition(Object condition) {
    this.condition = condition;
  }
  /**
   * @return the countSqlId
   */
  public String getCountSqlId() {
    return countSqlId;
  }
  /**
   * @param countSqlId the countSqlId to set
   */
  public void setCountSqlId(String countSqlId) {
    this.countSqlId = countSqlId;
  }
  /**
   * @return the countSql
   */
  public String getCountSql() {
    return countSql;
  }
  /**
   * @param countSql the countSql to set
   */
  public void setCountSql(String countSql) {
    this.countSql = countSql;
  }
  public int getStart() {
    return start;
  }
  public void setStart(int start) {
    this.start = start;
  }
  public int getEnd() {
    return end;
  }
  public void setEnd(int end) {
    this.end = end;
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((condition == null) ? 0 : condition.hashCode());
    result = prime * result + ((countSql == null) ? 0 : countSql.hashCode());
    result = prime * result + ((countSqlId == null) ? 0 : countSqlId.hashCode());
    result = prime * result + ((ds == null) ? 0 : ds.hashCode());
    result = prime * result + end;
    result = prime * result + ((sqlId == null) ? 0 : sqlId.hashCode());
    result = prime * result + start;
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    ParamObj other = (ParamObj) obj;
    if (condition == null) {
      if (other.condition != null) {
        return false;
      }
    } else if (!condition.equals(other.condition)) {
      return false;
    }
    if (countSql == null) {
      if (other.countSql != null) {
        return false;
      }
    } else if (!countSql.equals(other.countSql)) {
      return false;
    }
    if (countSqlId == null) {
      if (other.countSqlId != null) {
        return false;
      }
    } else if (!countSqlId.equals(other.countSqlId)) {
      return false;
    }
    if (ds == null) {
      if (other.ds != null) {
        return false;
      }
    } else if (!ds.equals(other.ds)) {
      return false;
    }
    if (end != other.end) {
      return false;
    }
    if (sqlId == null) {
      if (other.sqlId != null) {
        return false;
      }
    } else if (!sqlId.equals(other.sqlId)) {
      return false;
    }
    if (start != other.start) {
      return false;
    }
    return true;
  }
}
