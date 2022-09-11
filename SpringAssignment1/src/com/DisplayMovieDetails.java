package com;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class DisplayMovieDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object construction done by developer
//		 Employee  e = new Employee();
//		 e.setEid(101);
//		 e.setEname("");
//		 e.setAddress("CS MGR");
//		 
//		 System.out.println("Employee details: "+e);
//		 
		 //spring way   |  IOC(Inversion of Control)
		 Resource resource = new ClassPathResource("moviebean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);//spring which shall parse xml file anf construct the objects
		 
		 Movie movie = (Movie)factory.getBean("m2");
		 //Employee e2 = (Employee) factory.getBean("emp2");
		 
		 System.out.println("Display Movie Details: ");
		 System.out.println(movie);
		 
				 
	}

}
