package com.interviewPreo.week1Intro.IntroductionToSpringBo0t;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@ConditionalOnProperty(name="deploy_env", havingValue = "Production")
public class ProdDb implements Db{
    public String getData(){
        return "prod data";
    }
}
