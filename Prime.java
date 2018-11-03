package js.js;

import java.util.Scanner;

public class Prime{

	public static void main(String[] args) 
	{
     int x=2;
     boolean prime = false;
     
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number to check");
     int num = sc.nextInt();
     if(num==2||num==3)prime=true;
     else{
     while(x<=num/2)
     {
      if(num%x==0){
    	  prime=false;break;}
      else  
      {    prime=true;
         
      }
      x++;
     }
     }
      if(prime)
    	  System.out.print("the number is prime number");
      else
    	  System.out.print("the number is not a prime number");
     }
}
