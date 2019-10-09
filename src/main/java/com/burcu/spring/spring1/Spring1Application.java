package com.burcu.spring.spring1;

import com.burcu.spring.spring1.service.HelloWorldService;
import com.burcu.spring.spring1.service.HelloWorldServiceImpl;
import com.burcu.spring.spring1.utils.MessageManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class Spring1Application {


	@Bean
	public HelloWorldService getMEssageService(){
		return new HelloWorldServiceImpl();
	}


	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring1Application.class);
		MessageManager messageManager = applicationContext.getBean(MessageManager.class);
		messageManager.printMessage();

	}

}
