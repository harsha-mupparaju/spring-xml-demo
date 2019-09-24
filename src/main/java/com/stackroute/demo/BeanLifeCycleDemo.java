package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemo implements InitializingBean, DisposableBean {


   public  void customInit(){
       System.out.println("this is the custom init method");
   }


    public  void customDestroy(){
        System.out.println("this is the custom destroy method");
    }




    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" after setting properties");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");

    }
}
