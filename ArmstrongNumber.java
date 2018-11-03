package js.js;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{   Scanner sc = new Scanner(System.in);
	    System.out.println("enter a number");
	    int n = sc.nextInt();
	    int temp =n;
	    int sum=0;
	    int b;
	    while(n>0)
	    {
	    	b= n%10;
            n= n/10;
            sum=sum+b*b*b;
	    	
	    }
	    if(temp==sum)
	    {
	    	System.out.println("the number is armstrong number");
	    }
	    else
	    {
	    	System.out.println("not a armstrong number");
	    }
				
		
		

	}

}
