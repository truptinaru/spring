package com.interviewPreo.week1Intro.IntroductionToSpringBo0t;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@ConditionalOnProperty(name="frosting", havingValue = "stawberry")
@Component
public class StawberryFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        return "Stawberry Frosting";
    }
}
