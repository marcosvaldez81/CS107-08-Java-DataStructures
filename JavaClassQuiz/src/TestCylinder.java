
public class TestCylinder {

	public static void main(String[] args) {
		
		//declaring class variable
		Cylinder cylinder1 = new Cylinder(10, 5);
		Cylinder cylinder2 = new Cylinder(15, 10);
		
		//print volume utilizing getVolume
		System.out.printf("%s%.3f\n","The volume is " , cylinder1.getVolume());
		System.out.printf("%s%.3f\n","The volume is " , cylinder2.getVolume());
		
		//Increase height by 2.0 multiply?
		cylinder1.increaseHeight(2.0);
		cylinder2.increaseHeight(2.0);
		
		//print new volume with new height 
		System.out.printf("%s%.3f\n","The volume is " , cylinder1.getVolume());
		System.out.printf("%s%.3f\n","The volume is " , cylinder2.getVolume());
	}

}
