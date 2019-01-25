package com.stackroute.didemo;

import com.stackroute.didemo.domain.Actor;
import com.stackroute.didemo.domain.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppMain {
    public static void main(String[] args) {

       ApplicationContext context= SpringApplication.run(AppMain.class,args);
       Movie movie=(Movie) context.getBean("movie");
       movie.setId(1);
       movie.setTitle("The Banks of Ganges");
       System.out.println(movie);

       /*Replace default properties with value*/
       Actor actor=movie.getActor();
       actor.setName("Catrine Smith");
       actor.setDob("3/6/1992");

       movie.setActor(actor);
       System.out.println(movie);
    }
}
