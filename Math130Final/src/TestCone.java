
public class TestCone {

	public static void main(String[] args) {
		Cone cone = new Cone(5,10);
		Cone cone2 = new Cone(2,4);
		
		System.out.printf("%s%.3f\n","The volume is ", cone.getVolume());
		System.out.printf("%s%.3f\n","The volume is ", cone2.getVolume());
		
		cone.incrementRadius(4.0);
		cone2.incrementRadius(4.0);
		
		System.out.println(cone.toString());
		System.out.println(cone2.toString());
		
		
	}

}
