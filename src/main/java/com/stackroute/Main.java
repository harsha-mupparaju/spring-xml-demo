package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {


        XmlBeanFactory factory=new XmlBeanFactory((new ClassPathResource("beans.xml")));
       Movie movie=factory.getBean("movie",Movie.class);
        movie.displayMovieInfo();

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
          Movie movieInfo =  context.getBean("movie",Movie.class);
          movieInfo.displayMovieInfo();
    }

}
