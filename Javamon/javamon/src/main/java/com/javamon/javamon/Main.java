package com.javamon.javamon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Combat combat = (Combat) context.getBean("combat");
		combat.combat();
		System.out.println("And the winner is: "+combat.outcome().getName());
		System.out.println("thanks for playing javamon");

	}

}
