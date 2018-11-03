package js.js;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayEven {

	
		
		
		
		    public static void main(String[] args) 
		    {
		        int n, j = 0, k = 0;
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter no. of elements you want in array:");
		        n = s.nextInt();
		        int a[] = new int[n];
		        int odd[] = new int[n];
		        int even[] = new int[n];
		        System.out.println("Enter all the elements:");
		        for(int i = 0; i < n; i++)
		        {
		            a[i] = s.nextInt();
		        }
		        for(int i = 0; i < n; i++)
		        {
		            if(a[i] % 2 != 0)
		            {
		                odd[j] = a[i];
		                j++;
		            }
		            else
		            {
		                even[k] = a[i];
		                k++;
		            }
		        }
		        Arrays.sort(odd);
		        Arrays.sort(even);
		        
		        System.out.println("even :");
		        for (int i = even.length-1; i >=0 ; i--) {
		        	if(even[i]!=0)
					System.out.print(even[i]+" ");
				}
		        System.out.println("\nodd :");
		        for (int i = 0; i < odd.length; i++) {
		        	if(odd[i]!=0)
					System.out.print(odd[i]+" ");
				}
		    }
		
		

	}


