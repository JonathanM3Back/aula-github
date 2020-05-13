package membrosestaticos;

import java.util.Locale;
import java.util.Scanner;

public class program {
	
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius: " );
		Calculator radios = new Calculator();
		double radius = sc.nextDouble();
		
		double c = radios.circuference(radius);
		double v = radios.volume(radius);
		
		System.out.printf("Circumference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("PI VALUE: %.2f%n",radios.PI);
		sc.close();
		

	}
	

}
