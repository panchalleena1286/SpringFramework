package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieSpring {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("movieBean.xml");
		Main obj = (Main) context.getBean("m1");
		
		 
		 System.out.println("Display Movie Details: ");
		 System.out.println(obj);
		 context.registerShutdownHook();
		 
				 
	}

}
