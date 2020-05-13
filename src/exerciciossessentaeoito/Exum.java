package exerciciossessentaeoito;

import java.util.Locale;
import java.util.Scanner;

public class Exum {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double width,height,AREA;
		System.out.println("Enter rectagle width and height: ");
		System.out.print("Width: ");
		width = sc.nextDouble();
		System.out.print("Height: ");
		height = sc.nextDouble();
		AREA = area(width,height);
		System.out.printf("Area = %.2f", AREA);
		System.out.printf("\nPerimeter = %.2f", perimetro(width,height));
		System.out.print("\nDiagonal = "+ diagonal(width,height));
		
		
		
		sc.close();

	}
	public static double area(double a, double b) {
		return a * b;
		
	}
	public static double perimetro(double a, double b) {
		double x1,x2;
		x1 = a * 2;
		x2 = b * 2;
		return x1 + x2;
	}
	public static double diagonal(double a,double b) {
		return Math.sqrt((a * 2) + (b * 2));
	}

}
