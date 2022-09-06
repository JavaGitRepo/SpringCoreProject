package bean;

public class Person {
	
	private Address address;
	private String name;

	public Person(Address address,String name) {
		super();
		this.address = address;
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}
	
	public String getName() {
		return name;
	}
	
	
	

}
