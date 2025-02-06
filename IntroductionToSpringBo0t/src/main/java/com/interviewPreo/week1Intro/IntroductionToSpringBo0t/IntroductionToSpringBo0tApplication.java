package com.interviewPreo.week1Intro.IntroductionToSpringBo0t;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBo0tApplication implements CommandLineRunner {
	@Autowired
	Apple obj;

	@Autowired
	DBService dbService;

	@Autowired
	CakeBaker cakeBaker;
	public static void main(String[] args) {

		SpringApplication.run(IntroductionToSpringBo0tApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		obj.eatApple();
		System.out.println(dbService.getData());
		System.out.println(cakeBaker.getFrosting());
		System.out.println(cakeBaker.getSyrup());
	}
}
