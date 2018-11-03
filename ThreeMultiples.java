package js.js;

import java.util.Scanner;

public class ThreeMultiples {

	public static void main(String[] args) 
	{
        
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int x = sc.nextInt();
		int a[]=new int[x];
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
	     for(int i=0;i<a.length;i++)
	     {
	    	 if(a[i]%3==0)
	    	 {
	    		 System.out.println("the multiples of 3 are "+a[i]);
	    	 }
	     }
    	

	}

}
