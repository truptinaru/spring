package com.interviewPreo.week1Intro.IntroductionToSpringBo0t;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
   // @Autowired
    private  Db db;

    DBService(Db db){
        this.db=db;
    }

    String getData(){
        return db.getData();
    }

}
