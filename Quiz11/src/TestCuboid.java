
public class TestCuboid {

	public static void main(String[] args) {
		
		//declare the objects
		Cuboid cuboidOne = new Cuboid(5,10,16);
		Cuboid cuboidTwo = new Cuboid(3,10);
		
		//print out the correct volume and surface area utilizing Cuboid class
		System.out.printf("%s%d\n","The volume is " , cuboidOne.getVolume());
		System.out.printf("%s%d\n","The surface area is " , cuboidTwo.getSurfaceArea());

	}

}
