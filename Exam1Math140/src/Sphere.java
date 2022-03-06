
public class Sphere implements Comparable <Sphere> {
	private int radius;
	private int height;
	
	public Sphere(int radius, int height){
		this.radius = radius;
		this.height = height;

	}
	
	public int compareTo(Sphere s) {
		return this.radius + this.height - (s.height + s.radius);
	}
	
}
