package com.interviewPreo.week1Intro.IntroductionToSpringBo0t;

import org.springframework.stereotype.Component;

@Component
public class ChocolateFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
