package com.vdong.rocketmq.producer.controller;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class RocketMqProducerController {

   /*@Autowired
    private RocketMQTemplate rocketMQTemplate;


    @GetMapping("sendMsg")
    public void sendMsg(){
        rocketMQTemplate.convertAndSend("test-topic",
                UserInfo.builder()
                        .id(1)
                        .userName("张三")
                        .build()
                );
    }

    @GetMapping("sendMessage")
    public void sendMessage(String messgae){
        rocketMQTemplate.convertAndSend("str-topic",messgae);
    }*/
}
