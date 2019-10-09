package com.burcu.spring.spring1.configure;

import com.burcu.spring.spring1.service.HelloWorldService;
import com.burcu.spring.spring1.service.HelloWorldServiceImpl;
import com.burcu.spring.spring1.service.HelloWorldServiceImpl2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfigure {

    @Bean
    public HelloWorldService getMEssageService(){
        return new HelloWorldServiceImpl();
    }

}
