package com.aws.sqs.boot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWSSQSController {

    @Autowired
    public QueueMessagingTemplate queueMessagingTemplate;

    @Value("${cloud.aws.end-point.uri}")
    private String uri;


    @GetMapping("publish/{message}")
    public void sendMessageToQueue(@PathVariable String message){
        queueMessagingTemplate.send(uri, MessageBuilder.withPayload(message).build());
        System.out.println("Message Published to AWS Queue ");
    }



}
