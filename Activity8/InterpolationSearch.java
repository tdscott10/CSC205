package Activity8;

import java.util.Scanner;
 
public class InterpolationSearch
{
    public static int interpolationSearch(int[] array, int search)
    {
        int first = 0;
        int last = array.length - 1;
        int mid;
        
        while (array[first] <= search && array[last] >= search) 
        {
            if (array[last] - array[first] == 0)
            {
                return (first + last)/2;
            }
            
             mid = first + ((search - array[first]) * (last - first)) / (array[last] - array[first]);  
 
             if (array[mid] < search)
             {
                 first = mid + 1;
             }
             
             else if (array[mid] > search)
             {
                 last = mid - 1;
             }
             
             else
             {
                 return mid;
             }
        }
        
        if (array[first] == search)
        {
            return first;
        }
        else
        {
            return -1; 
        }
    }    
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );        
       
        int array[] = new int[10];
        
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i*2;
        }
        
        System.out.println("Enter a number that you wish to search for in the array.");
        int target = scan.nextInt();
        
        System.out.println();
        
        for(int ii = 0; ii < array.length; ii++)
        {
        	System.out.print(" " + array[ii] + "  ");
        }
        System.out.print("These are the numbers that is stored in the array. ");
        
        System.out.println("\n[0] [1] [2] [3] [4]  [5]  [6]  [7]  [8]  [9]" + " These are the array indexes.");
        

        int result = interpolationSearch(array, target);
 
        if (result == -1)
            System.out.println("\n"+ target +" number not found");
        else
            System.out.println("\n"+ "The number " + target + " is found at index " + "[" + result + "] in the array");
 
    }    
}