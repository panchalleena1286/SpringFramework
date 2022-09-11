package com.spring.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DisplayStudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings({ "resource" })
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student studentobj1 = (Student) context.getBean("student1");
		Student studentobj2 = (Student)context.getBean("student2");
		Test testobj1 = (Test) context.getBean("test1");
		Test testobj2 = (Test) context.getBean("test2a");
		Test testobj3 = (Test) context.getBean("test2b");
		
		System.out.println("Display Student and their Test details: ");
		System.out.println("First Student Details : "+studentobj1);
		System.out.println("His Test Details : "+testobj1);
		System.out.println();
		System.out.println("Second Student Details : "+studentobj2);
		System.out.println("His First Test Details : "+testobj2);
		System.out.println("Second Test Details : "+testobj3);
		
		context.registerShutdownHook();
		
		

	}

}
