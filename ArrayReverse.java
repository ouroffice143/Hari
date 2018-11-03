package js.js;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int x = sc.nextInt();
		int a[]=new int[x];
		System.out.println("enter the element");
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
		
			
			
		}
		for(int i=0;i<a.length;i++)
		{
			
			
			System.out.println("array elements====>"+a[i]);
			
			
		}
		for(int i=a.length-1;i>=0;i--)
		{
			
			
			System.out.println("array elements in reverse order====>"+a[i]);
			
			
		}

	}

}
