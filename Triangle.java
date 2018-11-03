package js.js;

import java.util.Scanner;

public class Triangle {
    
	public static void main(String[] args) 
	{   double area;
	    int perimeter;
	   
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a value");
		int a = sc.nextInt();
		System.out.println("enter the b value");
		int b = sc.nextInt();
		System.out.println("enter the c value");
		int c = sc.nextInt();
		perimeter = a+b+c;
		System.out.println("perimeter of triangle===>"+perimeter);
		System.out.println("-------------");
		System.out.println("enter the base value");
		int base = sc.nextInt();
		System.out.println("enter the height value");
		int height = sc.nextInt();
		area = 0.5*base*height;
		System.out.println("area of triangle is===>"+area);
 
	}

}
