package in.aj.beans;

	public class Address {
		private String city;
		private int pin;
		private int house;
		
		
		public void setCity(String city) {
			this.city = city;
		}
		
		public void setPin(int pin) {
			this.pin = pin;
		}

		public void setHouse(int house) {
			this.house = house;
		}

		@Override
		public String toString() {
			
			return "#"+city+", "+pin+", "+house;
		}

	}



