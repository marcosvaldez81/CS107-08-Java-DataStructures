
public class Location {
	
	
	private int streetNumber;
	private String streetName;
	private String city;
	
	public Location(int streetNumber, String streetName, String city) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		
	}
	public String toString() {
		return String.format("%d ", streetNumber) + streetName + "" + city;
	}
	
	public boolean equals(Object o) {
		boolean flag = false;
		
		if(o != null && getClass() == o.getClass()) {
			if (this == o) {
				flag = true;            
			}else {
				Location l = (Location) o;
				flag = this.streetName.equals(l.streetName) && this.city.equals(l.city) && this.streetNumber == l.streetNumber;
			}
			
		}
		return flag;

	}
	public static void main(String[] args) {
		

	}

}
