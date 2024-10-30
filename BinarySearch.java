package vinsys;
import java.util.*;
class BinaryFunction {
	 int BinaryFunction(int arr[], int left, int right, int x) {
		while(left<=right){
			int mid=left + (right - left) / 2;
			if(arr[mid]==x) {
				return x;
			}
			else if(arr[mid]>x) {
				right=mid-1;
			}
			else {
				left =mid+1;
			}
		}
		return -1;
	}
}
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int x;
		BinaryFunction obj = new BinaryFunction();
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
		int result=obj.BinaryFunction(arr, 0, n-1, x);
		if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
		
		
	}

}

