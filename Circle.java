package js.js;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) 
	{   double area;
	    double perimeter;
		double pi=3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius value");
		int radius = sc.nextInt();
		
		area = pi*(radius*radius);
		System.out.println("area of circle is===>"+area);
		System.out.println("-----------");
		
		perimeter = 2*pi*radius;
		System.out.println("perimeter of triangle is===>"+perimeter);
		
		
		

	}

}
