package com.interviewPreo.week1Intro.IntroductionToSpringBo0t;

import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

   Frosting frosting;
   Syrup syrup;

   CakeBaker(Frosting frosting,Syrup syrup){
       this.frosting=frosting;
       this.syrup=syrup;
   }

   public String getFrosting(){
       return frosting.getFrostingType();
   }

   public  String getSyrup(){
       return syrup.getSyrupType();
   }
}
