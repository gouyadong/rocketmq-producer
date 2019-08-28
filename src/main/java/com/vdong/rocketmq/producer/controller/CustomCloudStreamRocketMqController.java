package com.vdong.rocketmq.producer.controller;

import com.vdong.rocketmq.producer.interfaces.MySource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gouyadong
 */
@Slf4j
@RestController
public class CustomCloudStreamRocketMqController {
    @Autowired
    private MySource mySource;

    @GetMapping("sendMsg")
    public String sendMsg(String msg){
        boolean flag1 = mySource.output1().send(MessageBuilder.withPayload(msg).build());
        log.info("发送消息返回结果：{}", flag1);
        boolean flag2 = mySource.output2().send(MessageBuilder.withPayload(msg).build());
        log.info("发送消息返回结果：{}", flag2);
        return flag1 + " " + flag2;
    }
}
