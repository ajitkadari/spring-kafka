package io.pivotal.lab1.controller;

import io.pivotal.lab1.kafka.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    public static Logger logger = LoggerFactory.getLogger(KafkaController.class);

    private final Producer producer;
    private static final String TOPIC = "user";

    @Autowired
    KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/user/{name}")
    public void sendMessageToKafkaTopic(@PathVariable String name) {
        this.producer.sendMessage(TOPIC, name);
    }
}
