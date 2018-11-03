package js.js;

public class ArrayRepeat 
{
	void repeat(int arr[], int size)  
    { 
        int i, j; 
        System.out.println("Repeated Elements are :"); 
        for (i = 0; i < size; i++)  
        { 
            for (j = i + 1; j < size; j++)  
            {  int count=0; 
            	
                if (arr[i] == arr[j])  
                {
                	count++;
                	System.out.println(arr[i]+" is repeated "+count+" times"); 
                    //System.out.print(arr[i] + " "); 
                }
               
            } 
        } 
    } 
	public static void main(String[] args) 
	{
		    ArrayRepeat repeat = new ArrayRepeat(); 
	        int arr[] = {4, 2, 4, 5}; 
	        int arr_size = arr.length; 
	        repeat.repeat(arr, arr_size); 

	}

}
