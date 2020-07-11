package io.pivotal.lab2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringKafkaLab2Application {

    public static Logger logger = LoggerFactory.getLogger(SpringKafkaLab2Application.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaLab2Application.class, args);
    }

    @Autowired
    private KafkaTemplate<String, String> template;

}
