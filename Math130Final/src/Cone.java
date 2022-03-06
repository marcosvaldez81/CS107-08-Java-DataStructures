
public class Cone {
	private double height;
	private double radius;
	
	public Cone(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double getHeight() {
		return height;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getVolume() {
		double volume;
		volume = (Math.PI * (radius * radius) * height) / 3.0;
		return volume;
	}
	
	public void incrementRadius(double r) {
		radius = radius + r;
	}
	
	public String toString() {
		return "height = " + height + " radius = " + radius;
	}
	
}
