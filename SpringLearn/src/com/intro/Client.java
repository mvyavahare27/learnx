package com.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("***********Post loading`******************");
		
		Employee emp1 = (Employee) context.getBean("employee1");
		System.out.println("ID: employee1: " +emp1);
		
		Employee emp2 = (Employee) context.getBean("employee2");
		System.out.println("ID: employee2: " +emp1);
		
		Employee emp3 = (Employee) context.getBean("employee3");
		System.out.println("ID: employee3: " +emp3);
		
		Employee emp4 = (Employee) context.getBean("employee4");
		System.out.println("ID: employee4: " +emp4);
		
		Employee emp5 = (Employee) context.getBean("employee5");
		System.out.println("ID: employee5: " +emp5);
		
		Address emp6 = (Address) context.getBean("addressBean");
		System.out.println(emp6);
		
		/*Person person = (Person) context.getBean("employeeBean");
		System.out.println(person);
		 
		Car car = (Car) context.getBean("carBean");
		System.out.println(car);
		*/
		
	}

}
