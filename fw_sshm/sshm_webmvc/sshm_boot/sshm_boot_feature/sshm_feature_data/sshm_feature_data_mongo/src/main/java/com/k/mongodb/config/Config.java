package com.k.mongodb.config;

import com.mongodb.MongoCredential;
import com.mongodb.client.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class Config {
    @Bean
    public MongoClient mongoClient() throws Exception {
        return mongo().getObject();
    }

    @Bean
    public MongoClientFactoryBean mongo() {
        MongoClientFactoryBean mongo = new MongoClientFactoryBean();
        mongo.setHost("localhost");
        mongo.setPort(27017);
        MongoCredential credential = MongoCredential.createCredential("root", "admin", "111111".toCharArray());
        mongo.setCredential(new MongoCredential[]{credential});
        return mongo;
    }


    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoClient(), "mongo");
    }
}
