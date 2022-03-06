/* Marcos Valdez  
 * Math 130-06
 * 09/17/2020
 * 
 * */
import java.util.Scanner;
public class Spheres {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);//scanner
		
		int radius1;
		double centimeters1;
		double volume1;
		double surfaceArea1;
		
		
		int radius2;
		double centimeters2;
		double volume2;
		double surfaceArea2;
											// This whole code block is variables for all the conversions for 5 spheres
		int radius3;
		double centimeters3;
		double volume3;
		double surfaceArea3;
		
		
		int radius4;
		double centimeters4;
		double volume4;
		double surfaceArea4;
		
		
		int radius5;
		double centimeters5;
		double volume5;
		double surfaceArea5;
		
		
		
		
		
		// code block here is prompting user to enter a integer in inches
		
		System.out.printf("Please enter an integer radius measurement (in inches): ");
		radius1 = in.nextInt(); //fetches input
		
		System.out.printf("Please enter an integer radius measurement (in inches): ");
		radius2 = in.nextInt();
		
		System.out.printf("Please enter an integer radius measurement (in inches): ");
		radius3 = in.nextInt(); 
		
		System.out.printf("Please enter an integer radius measurement (in inches): ");
		radius4 = in.nextInt(); 
		
		System.out.printf("Please enter an integer radius measurement (in inches): ");
		radius5 = in.nextInt(); 
		
		System.out.println();//spacer
		
		
		//below are conversions for each of the spheres (individually)
		

		centimeters1 = radius1 * 2.54; // this is the centimeters conversion
		volume1 = (4.0/3) * Math.PI * Math.pow(centimeters1,3);//volume conversion
		surfaceArea1 = 4 * Math.PI * Math.pow(centimeters1, 2);	//area conversion
		
		
		centimeters2 = radius2 * 2.54; 
		volume2 = (4.0/3) * Math.PI * Math.pow(centimeters2,3);
		surfaceArea2 = 4 * Math.PI * Math.pow(centimeters2, 2);
		

		centimeters3 = radius3 * 2.54; 
		volume3 = (4.0/3) * Math.PI * Math.pow(centimeters3,3);
		surfaceArea3 = 4 * Math.PI * Math.pow(centimeters3, 2);	
		

		centimeters4 = radius4 * 2.54; 
		volume4 = (4.0/3) * Math.PI * Math.pow(centimeters4,3);
		surfaceArea4 = 4 * Math.PI * Math.pow(centimeters4, 2);	
		

		centimeters5 = radius5 * 2.54; 
		volume5 = (4.0/3) * Math.PI * Math.pow(centimeters5,3);
		surfaceArea5 = 4 * Math.PI * Math.pow(centimeters5, 2);	
		
		
		System.out.printf("%s%15s%20s%26s\n", "Radius (in.)", "Radius (cm.)", "Volume (cu. cm.)", "Surface Area(sq. cm.)" );


		System.out.printf("%s", "__________________________________________________________________________");
		
		System.out.printf("\n%-15d%-17.1f%-20.1f%-28.1f", radius1, centimeters1, volume1, surfaceArea1);

		System.out.printf("\n%-15d%-17.1f%-20.1f%-28.1f", radius2, centimeters2, volume2, surfaceArea2);

		System.out.printf("\n%-15d%-17.1f%-20.1f%-28.1f", radius3, centimeters3, volume3, surfaceArea3);
	
		System.out.printf("\n%-15d%-17.1f%-20.1f%-28.1f", radius4, centimeters4, volume4, surfaceArea4);
		
		System.out.printf("\n%-15d%-17.1f%-20.1f%-28.1f", radius5, centimeters5, volume5, surfaceArea5);
		
		
		System.out.println();
		
		double average;
		average = (radius1+radius2+radius3+radius4+radius5) / 5.0;
		
		System.out.println();
		System.out.printf("%s%.1f%s", "The average of all of the radii is: ", average, " inches");
		

	}

}
