package com.interviewPreo.week1Intro.IntroductionToSpringBo0t;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component
public class Apple {
    public void eatApple(){
        System.out.println("I am eating the apple");
    }

    @PostConstruct
    void callThisMethodBeanUse(){
        System.out.println("Creating the apple before use");
    }

    @PreDestroy
    void callThisMethodBeforeBeanDestruction(){
        System.out.println("Destroying the apple bean");
    }


}
