package com.k.spring.sshm.boot.security.service;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 从数据库查询相关的密码和权限，这里返回一个假的数据
        // 用户名,密码,权限
        return new User(username,
                "123456",
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
