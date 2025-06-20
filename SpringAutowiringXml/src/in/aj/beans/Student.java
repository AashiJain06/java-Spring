package in.aj.beans;

public class Student {
	private String name;
	private int roll;
	private Address addres;
	public void setName(String name) {
		this.name = name;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setAddres(Address addres) {
		this.addres = addres;
	}
	
	public void display() {
		
		System.out.println("name:"+name);
		System.out.println("roll :" +roll);
		System.out.println("Address :" +addres);
	}
	

}
