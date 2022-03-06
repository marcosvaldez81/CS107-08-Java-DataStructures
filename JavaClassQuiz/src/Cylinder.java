
public class Cylinder {
	
	//instance variables
	private double radius;
	private double height;
	
	//constructor
	public  Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	// accessors
	public double getRadius() {
		return radius;
	}
	
	public double getHeight() {
		return height;
	}
	
	//mutators
	
	public void setRadius(double radius1) {
		this.radius = radius1;
	}
	
	public void setHeight(double height1) {
		this.height = height1;
	}
	
	public double getVolume() {
		double math = Math.PI * Math.pow(radius, 2) * height;
		return math;
	}
	
	
	//method
	public void increaseHeight(double extraHeight) {
		this.height = extraHeight * height; 
	}
}
