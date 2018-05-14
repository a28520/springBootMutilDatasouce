package com.multi.datasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author wgc
 */
@SpringBootApplication
//@EnableTransactionManagement
@EnableMongoRepositories("com.multi.datasource.persistence.mongo")
public class Application {
	public static void main(String[] args) throws Exception {
         SpringApplication.run(Application.class, args);
     }
}