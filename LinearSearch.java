package vinsys;

import java.util.*;

class linearfunction {
	 int linearfunction(int arr[], int n, int x) 
	    { 
	        for (int i = 0; i < n; i++) { 
	           
	            if (arr[i] == x) 
	                return i; 
	        } 
	        return -1; 
	    } 
}
public class LinearSearch {

	public static void main(String[] args) {
		int n;
		int x;
		linearfunction obj = new linearfunction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elemnts to add in array: ");
		n=sc.nextInt();
		int[] arr;
		arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+" th element");
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the number you want to search: ");
		x=sc.nextInt();
		int result=obj.linearfunction(arr,n, x);
		if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
		
		
	}

}
