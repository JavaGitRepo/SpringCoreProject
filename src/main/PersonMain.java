package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Person;

public class PersonMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person)context.getBean("person");
		System.out.println("Address : "+person.getAddress());
		System.out.println("Name : "+person.getName());
	}

}
