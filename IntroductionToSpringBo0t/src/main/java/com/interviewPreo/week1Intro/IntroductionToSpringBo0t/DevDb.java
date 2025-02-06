package com.interviewPreo.week1Intro.IntroductionToSpringBo0t;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name ="deploy_env",havingValue ="development")
public class DevDb implements Db{
    public String getData(){
          return "Dev data";
     }
}
