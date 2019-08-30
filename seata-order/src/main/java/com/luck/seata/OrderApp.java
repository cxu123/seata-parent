package com.luck.seata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

/**
 * Hello world!
 *
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDubboConfiguration
@EnableTransactionManagement
public class OrderApp {

    private static Logger LOGGER = LoggerFactory.getLogger(OrderApp.class);

    public static void main(String[] args) {
        LOGGER.info("springboot project with seata starting...");
        SpringApplication.run(OrderApp.class, args);

    }
}
