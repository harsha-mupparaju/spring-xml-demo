package com.stackroute.demo;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemo implements BeanPostProcessor {
    {
        System.out.println("beanPostProcessor demo");
    }
}

