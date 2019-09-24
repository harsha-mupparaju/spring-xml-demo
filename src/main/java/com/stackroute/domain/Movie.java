package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements BeanNameAware{    // BeanFactoryAware {//ApplicationContextAware {
  Actor actor;



    public Movie(Actor actor) {
        this.actor = actor; }


//   /*   public void setActorInfo(Actor actorInfo) {
//        this.actorInfo = actorInfo;
//    }*/

    public void displayMovieInfo(){
        System.out.println("Actor Name = " + actor.getActorName() + " ,Actor gender = " + actor.getActorGender()
         + " ,Actor Age = " + actor.getActorAge());
    }

    @Override
    public void setBeanName(String s) {

    }

 /*   @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }*/

 /*   @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }*/
}
