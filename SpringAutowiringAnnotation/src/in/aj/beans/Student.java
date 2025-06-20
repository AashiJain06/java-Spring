package in.aj.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String name;
	private int roll;
	@Autowired
	@Qualifier("address1")
	private Address address;
	
public Address getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	public int getRoll() {
		return roll;
	}

public void display1() {
	System.out.println("Name : "+name);
	System.out.println("RollNo. : "+roll);
	System.out.println("Address : "+address);
}

public void setName(String name) {
	this.name = name;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public void setaddress(Address address) {
	this.address = address;	
}


	
}




