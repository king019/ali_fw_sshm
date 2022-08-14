package com.k.spring.sshm.boot.security.inf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 配置拦截器保护请求
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/css/**", "/index").permitAll()     /*与之匹配的请求/CSS/*和/索引完全无障碍*/
                .antMatchers("/user/**").hasRole("USER")          /*与之匹配的请求/用户/*要求对用户进行身份验证，并且必须与用户角色*/
                .and().formLogin()
                .loginPage("/login").failureUrl("/login-error");                /*基于表单的身份验证是通过自定义登录页和故障url启用的。*/
    }

    /**
     * 配置user-detail服务
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser(User.withDefaultPasswordEncoder().username("user").password("password").roles("USER"));
    }
}