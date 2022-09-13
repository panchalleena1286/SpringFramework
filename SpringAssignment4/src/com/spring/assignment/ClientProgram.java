package com.spring.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientProgram {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Player obj1 = (Player) context.getBean("player1");
		Player obj2 = (Player) context.getBean("player2");
		Player obj3 = (Player) context.getBean("player3");
		Player obj4 = (Player) context.getBean("player4");
		Player obj5 = (Player) context.getBean("player5");
		
		Country obj6 = (Country) context.getBean("country1");
		Country obj7 = (Country)context.getBean("country2");
		
		System.out.println("Details of All the Players and Their corresponding Country Details : ");
		System.out.println(obj1);
		System.out.println(obj6);
		System.out.println();
		
		System.out.println(obj2);
		System.out.println(obj6);
		System.out.println();
		
		System.out.println(obj3);
		System.out.println(obj7);
		System.out.println();
		
		System.out.println(obj4);
		System.out.println(obj7);
		System.out.println();
		
		System.out.println(obj5);
		System.out.println(obj7);
		System.out.println();

	}

}
