package com.vdong.rocketmq.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StreamCloudRocketMqController {

    @Autowired
    private Source source;


    @GetMapping("streamSendMsg")
    public String streamSendMsg(String msg){
        this.source.output().send(
                MessageBuilder.withPayload(msg).build()
        );
        return "success";
    }
}
