package com.k.redis.inf;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
@Configuration
public class RedisConfigInf {
    public RedisConnectionFactory standalone() {
        RedisStandaloneConfiguration clientConfig = new RedisStandaloneConfiguration();
        clientConfig.setHostName("127.0.0.1");
        clientConfig.setPort(6379);
        JedisConnectionFactory factory = new JedisConnectionFactory(clientConfig);
        return factory;
    }
    @Bean
    public RedisTemplate redisTemplate() {
        RedisTemplate template = new RedisTemplate();
        template.setConnectionFactory(standalone());
        return template;
    }
//    @Bean
//    public JedisConnectionFactory redisConnectionFactory() {
//        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration("server", 6379);
//        return new JedisConnectionFactory(config);
//    }
}
