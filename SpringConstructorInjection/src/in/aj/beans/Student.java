package in.aj.beans;

	public class Student {
		private String name;
		private int roll;
		private Address addres;
	    public Student(String name , int roll , Address addres)
	    {
	    	this.name = name;
	    	this.roll = roll;
	    	this.addres = addres;
	    }
		
		public void display() {
			
			System.out.println("name:"+name);
			System.out.println("roll :" +roll);
			System.out.println("Address :" +addres);
		}
		

	}


