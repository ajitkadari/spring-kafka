package io.pivotal.lab1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringKafkaLab1Application {

    public static Logger logger = LoggerFactory.getLogger(SpringKafkaLab1Application.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaLab1Application.class, args);
    }

}
