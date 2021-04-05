package com.ravi.ratingdataservice.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories(basePackages = "com.ravi.ratingdataservice.model")
@Configuration
public class MongoDBConfig {
}
