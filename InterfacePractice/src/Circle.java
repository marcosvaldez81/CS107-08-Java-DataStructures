
public class Circle implements Comparable <Circle> {
	private int length;
	private int radius;
	
	public Circle(int length, int radius) {
		this.length = length; 
		this.radius = radius;
		
	}
	public int getRadius() {
		return radius;
	}
	
	public int getLength(){
		return length;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	
	public int compareTo(Circle c) {
		//return this.radius - c.radius; this would show that cOne is less than cTwo
		return c.radius - this.radius;
	}
	
	public boolean equals(Object o) {
		boolean flag = false;
		
		if(o != null && getClass() == o.getClass()) {
			if(this == o) {
				flag = true;
			}
			else {
				flag = radius == ((Circle) o).radius;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Circle cOne = new Circle(10,5);
		Circle cTwo = new Circle(12,9);
		
		int d = cOne.compareTo(cTwo);
		
		System.out.println("d= " + d);

	}

}
