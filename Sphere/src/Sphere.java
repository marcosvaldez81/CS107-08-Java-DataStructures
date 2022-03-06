
public class Sphere implements Comparable <Sphere> {
	
	private int radius;
	private int height;
	
	
	public  Sphere(int radius, int height) {
		this.radius = radius;
		this.height = height;
		
	}
	
	public boolean equals(Object o) {
		boolean flag = false;
		if (o != null && getClass() == o.getClass()) {
			if (this == o) {
				flag = true;
			}else {
				Sphere s = (Sphere)o;
				flag = radius == s.radius && height == s.height;
			}
		}
		return flag;
	}
	public int compareTo(Sphere s) {
		return s.radius + s.height - height + radius;
	
	}
	
	public static void main(String[] args) {
		

	}

}
