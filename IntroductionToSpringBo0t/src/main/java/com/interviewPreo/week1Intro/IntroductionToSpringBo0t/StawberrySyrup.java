package com.interviewPreo.week1Intro.IntroductionToSpringBo0t;

import org.springframework.stereotype.Component;

@Component
public class StawberrySyrup implements Syrup{

    @Override
    public String getSyrupType() {
        return "Stawberry Syrup";
    }
}
