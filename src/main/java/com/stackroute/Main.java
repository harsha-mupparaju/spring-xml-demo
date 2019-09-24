package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {


       /* XmlBeanFactory factory=new XmlBeanFactory((new ClassPathResource("beans.xml")));
       Movie movie=factory.getBean("movie",Movie.class);
        movie.displayMovieInfo();
*/
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
          Movie movieInfo1 =  context.getBean("movie1",Movie.class);
          movieInfo1.displayMovieInfo();

          Movie movieInfo2=context.getBean("movie2",Movie.class);
          movieInfo2.displayMovieInfo();

        Movie movieInfo3=context.getBean("movie3",Movie.class);
        movieInfo3.displayMovieInfo();

        Movie movieInfo4 =context.getBean("movie4",Movie.class);
        movieInfo4.displayMovieInfo();

      System.out.println(movieInfo1==movieInfo2);
       // System.out.println(movieInfo1.equals(movieInfo4));
    }

}
