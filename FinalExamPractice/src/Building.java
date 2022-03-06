
public class Building {
	
	 	private String location;
	    private String address;
	    private int numFloors;
	    private int numDoors;
	    
	    public Building(String location, String address, int numFloors, int numDoors) {
	        this.location = location;
	        this.address = address;
	        this.numFloors = numFloors;
	        this.numDoors = numDoors;
	    }
	
	    public String getLocation() {
	        return location;
	    }
	
	    public void setLocation(String location) {
	        this.location = location;
	    }
	
	    public String getAddress() {
	        return address;
	    }
	
	    public void setAddress(String address) {
	        this.address = address;
	    }
	
	    public int getNumFloors() {
	        return numFloors;
	    }
	
	    public void setNumFloors(int numFloors) {
	        this.numFloors = numFloors;
	    }
	
	    public int getNumDoors() {
	        return numDoors;
	    }
	
	    public void setNumDoors(int numDoors) {
	        this.numDoors = numDoors;
	    }
	    
	    public boolean equals(Object o) {
	    	boolean flag = false;
			
			if(o != null && getClass() == o.getClass()) {
				if (this == o) {
					flag = true;            
				}else {
					Building b = (Building) o;
					
					flag = this.location.equals(b.location) && this.address.equals(b.address) && this.numFloors == b.numFloors 
			    			&& this.numDoors ==b.numDoors;
					
				}

			}
			return flag;	
	    }
	
	
}
