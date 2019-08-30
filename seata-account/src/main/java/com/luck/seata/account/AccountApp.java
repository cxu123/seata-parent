package com.luck.seata.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

/**
 *
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDubboConfiguration
@EnableTransactionManagement
public class AccountApp {
    private static Logger LOGGER = LoggerFactory.getLogger(AccountApp.class);

    public static void main(String[] args) {
        LOGGER.info("springboot project with seata starting...");
        SpringApplication.run(AccountApp.class, args);

    }
}
