package org.example;

import org.example.common.BeansException;
import org.example.service.AService;
import org.example.xmlBean.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws BeansException {
        ClassPathXmlApplicationContext ctx = new
                ClassPathXmlApplicationContext("beans.xml");
        AService aService = (AService)ctx.getBean("aservice");
        aService.sayHello();
    }
}