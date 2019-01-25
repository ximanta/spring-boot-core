package com.stackroute.didemo.config;


import com.stackroute.didemo.domain.Actor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigurator {

    @Bean
    public Actor createActorBean(){
        Actor actor=new Actor(1,"Default name","Default age","Female");
        return actor;
    }
}
