package co.edureka;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object construction done by developer
		 Employee  e = new Employee();
		 e.setEid(101);
		 e.setEname("Leena");
		 e.setAddress("CS MGR");
		 
		 System.out.println("Employee details: "+e);
		 
		 //spring way   |  IOC(Inversion of Control)
		 Resource resource = new ClassPathResource("employeebean.xml");
		 @SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(resource);//spring which shall parse xml file anf construct the objects
		 
		 Employee e1 = (Employee)factory.getBean("emp");
		 Employee e2 = (Employee) factory.getBean("emp2");
		 
		 System.out.println("Employee1 details: "+e1);
		 System.out.println("Employee2 details: "+e2);
		 
				 
	}

}
