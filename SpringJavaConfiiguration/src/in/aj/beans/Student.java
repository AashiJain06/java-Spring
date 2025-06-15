package in.aj.beans;

public class Student {
	private String name;
	private int roll;
	private String city;
	
	public String getName() {
		return name;
	}

	public int getRoll() {
		return roll;
	}
	
	public String getCity() {
		return city;
	}
	
 
public void display1() {
	System.out.println("Name : "+name);
	System.out.println("RollNo. : "+roll);
	System.out.println("City : "+city);
}
	


public void setName(String string) {
	name = string;
}

public void setRoll(int i) {
	roll = i;
	
}

public void setCity(String city2) {
	city = city2;
	
}



}
