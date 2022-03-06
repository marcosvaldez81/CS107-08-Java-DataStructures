
public class MyLocation extends Location{
	private String state;
	
	
	public MyLocation( int streetNumber, String streetName, String city, String state) {
		super(streetNumber,streetName,city);
		this.state = state;
	}
	
	
	public String toString() {
		return super.toString() + state;
	}
	
	
	public boolean equals(Object o) {
		boolean flag = false;
		
		if(o != null && getClass() == o.getClass()) {
			if (this == o) {
				flag = true;            
			}else {
				MyLocation ML = (MyLocation) o;
				flag = super.equals(o) && this.state.equals(ML.state);
			}
			
		}
		return flag;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
