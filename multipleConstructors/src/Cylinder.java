
public class Cylinder {
	private double height;
	private double radius;
	
	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public Cylinder(double height) {
		this(height,1);
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double getVolume() {
		double volume = Math.PI * Math.pow(radius, 2) * height;
		return volume;
	}
}
