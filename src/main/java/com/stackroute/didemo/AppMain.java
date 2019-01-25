package com.stackroute.didemo;

import com.stackroute.didemo.domain.Actor;
import com.stackroute.didemo.domain.Movie;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppMain {
    public static void main(String[] args) {
         Actor actor=new Actor(1,"Al Gorg","12/11/1990","Male");
         Movie movie=new Movie(actor);
         movie.setId(1);
         movie.setTitle("The Banks of Ganges");
         System.out.println(movie);
    }
}
