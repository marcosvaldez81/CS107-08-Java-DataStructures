
public class Cube implements Comparable <Cube> {
	
	private int width;
	private int length;
	private int height;
	
	
	public Cube(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public Cube(int width) {
		this(width, 1,5);
		
	}
	public int compareTo(Cube c) {
		return this.height + this.length + this.width - (c.height + c.length + c.width);
	}
		
	
	public static void main(String[] args) {
//		Cube cOne = new Cube(10, 2, 19);
//		Cube cTwo = new Cube(1, 8,  25);
//		
//		System.out.println(cOne.compareTo(cTwo));
		
	}

}
