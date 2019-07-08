package com.uvb76.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

//@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class DubboApplication {

    public static void main(String[] args) throws Exception {

        new Thread(new Server()).run();

    }

}
