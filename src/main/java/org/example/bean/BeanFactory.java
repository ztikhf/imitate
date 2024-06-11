package org.example.bean;

import org.example.common.BeansException;

public interface BeanFactory {
    Object getBean(String beanName) throws BeansException, RuntimeException;
    void registerBeanDefinition(BeanDefinition beanDefinition);
}