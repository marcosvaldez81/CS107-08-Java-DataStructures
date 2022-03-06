
public class Cuboid {
	private int height;
	private int length;
	private int width;
	
	
	public Cuboid(int height, int length, int width) { //constructor 1
		this.height = height;
		this.length = length;
		this.width = width;
	}
	
	public Cuboid(int length, int width) { //constructor 2
		height = 10;
		this.length = length;
		this.width = width;
	}
	
	//accessors
	public int getHeight() {
		return height;
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	
	// mutators
	public void setHeight(int height) {
		this.height = height;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	//methods
	public int getVolume() {
		int volume = length * width * height;
		return volume;
	}
	public int getSurfaceArea() {
		int area = 2 * ((length * width) + (width * height) + (height * length));
		return area; 
	}
	
}
