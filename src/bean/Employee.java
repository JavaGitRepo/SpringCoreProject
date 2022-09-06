package bean;

import java.util.List;
import java.util.Map;

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	private List<String> projects;
	private Map<String,Address> addresses;
	private List<ContactNumber> numbers;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, float salary,List<String> projects,Map<String,Address> addresses,List<ContactNumber> numbers) {
		System.out.println("Employee");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.projects = projects;
		this.addresses = addresses;
		this.numbers = numbers;
	}

	public Employee(String s, String s2, String s23, String s234) {
	}

	public List<ContactNumber> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<ContactNumber> numbers) {
		this.numbers = numbers;
	}

	public Map<String, Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Map<String, Address> addresses) {
		this.addresses = addresses;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	
	

}
