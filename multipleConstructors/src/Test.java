
public class Test {

	public static void main(String[] args) {
		
		Cylinder cOne = new Cylinder(10.0 , 5.0);
		
		Cylinder cyl2 = new Cylinder(10);
		
		System.out.printf("%s%1.2f\n","Volume of first cylinder: ", cOne.getVolume());
		System.out.printf("%s%1.2f","Volume of second cylinder: ", cyl2.getVolume());
		
		
	}

}
