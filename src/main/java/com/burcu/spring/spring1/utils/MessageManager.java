package com.burcu.spring.spring1.utils;

import com.burcu.spring.spring1.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageManager {

    @Autowired
    HelloWorldService helloWorldService;

    public void printMessage(){
        System.out.println("MESAJ : " + this.helloWorldService.getMEssage());
    }


}
