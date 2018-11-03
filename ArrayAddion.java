package js.js;

import java.util.Scanner;

public class ArrayAddion{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row size");
		int a = sc.nextInt();
		System.out.println("enter the column size");
		int b = sc.nextInt();
		int x[][]= new int[a][b];
		int y[][]= new int[a][b];
		int c[][]= new int[a][b];
		System.out.println("enter the elements into first matxix");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				x[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the elements into second matxix");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				y[i][j]=sc.nextInt();
			}
		}
		System.out.println("addition of two matrices");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.println(x[i][j]+y[i][j]);
			}
		  
			
		}
		System.out.println("multiplication of two matrices");
		for(int k=0;k<a;k++)
		{
			for(int i=0;i<b;i++)
			{
				for(int j=0;j<b;j++)
				{
					c[k][i]= c[k][i]+ x[k][j]*y[j][i];
				}
			  
				System.out.println(c[k][i]);
			}
		}

	}

}
