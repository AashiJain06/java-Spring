package in.aj.beans;

	public class Address {
		private String city;
		private int pin;
		private int house;
		
		public Address(String city , int pin , int house)
		{
			this.city = city;
			this.pin = pin;
			this.house = house;
		}
		@Override
		public String toString() {
			
			return "#"+city+", "+pin+", "+house;
		}

	}



