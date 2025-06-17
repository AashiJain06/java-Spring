package in.aj.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Aashi")
	private String name;
	@Value("1010")
	private int roll;
	@Value("Indore")
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("City: "+city);
	}
	

}
