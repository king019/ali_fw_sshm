package com.k.redis.dao;
import com.k.redis.entity.User;

import java.util.List;
/**
 * @author http://blog.csdn.net/java2000_wl
 * @version <b>1.0</b>
 */
public interface IUserDao {
    /**
     * 新增 <br>
     * ------------------------------<br>
     */
    boolean add(User user);
    /**
     * 批量新增 使用pipeline方式 <br>
     * ------------------------------<br>
     */
    boolean add(List<User> list);
    /**
     * 删除 <br>
     * ------------------------------<br>
     */
    void delete(String key);
    /**
     * 删除多个 <br>
     * ------------------------------<br>
     */
    void delete(List<String> keys);
    /**
     * 修改 <br>
     * ------------------------------<br>
     */
    boolean update(User user);
    /**
     * 通过key获取 <br>
     * ------------------------------<br>
     */
    User get(String keyId);
}
