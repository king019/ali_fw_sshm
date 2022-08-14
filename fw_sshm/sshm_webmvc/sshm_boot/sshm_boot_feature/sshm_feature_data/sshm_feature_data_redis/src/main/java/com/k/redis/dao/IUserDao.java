package com.k.redis.dao;

import com.k.redis.entity.User;

import java.util.List;

public interface IUserDao {
    boolean add(User user);

    boolean add(List<User> list);

    void delete(String key);

    void delete(List<String> keys);

    boolean update(User user);

    User get(String keyId);
}
