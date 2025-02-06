package com.interviewPreo.week1Intro.IntroductionToSpringBo0t;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class StawberryFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        return "Stawberry Frosting";
    }
}
