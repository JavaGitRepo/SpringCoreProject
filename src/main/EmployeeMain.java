package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bean.Employee;

public class EmployeeMain {
	
	public static void main(String[] args) {
	
		//Resource resource = new  ClassPathResource("beans.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		//System.out.println("Resource!!!");
		//Employee emp = (Employee) factory.getBean("emp");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Context !!!");
		Employee emp = (Employee) context.getBean("emp");
		
		
		System.out.println("Employee Details : ");
		System.out.println("ID : "+emp.getId());
		System.out.println("Name : "+emp.getName());
		System.out.println("Salary : "+emp.getSalary());
		System.out.println("Projects : "+emp.getProjects());
		System.out.println("Addresses : "+emp.getAddresses());
		System.out.println("Contact Numbers : "+emp.getNumbers());
		
		Employee emp1 = (Employee) context.getBean("emp1");
		
		
		System.out.println("Employee Details : ");
		System.out.println("ID : "+emp1.getId());
		System.out.println("Name : "+emp1.getName());
		System.out.println("Salary : "+emp1.getSalary());
		System.out.println("Projects : "+emp1.getProjects());
		System.out.println("Addresses : "+emp1.getAddresses());
		System.out.println("Contact Numbers : "+emp1.getNumbers());
	}

}
