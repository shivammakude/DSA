package vinsys;

import java.util.Scanner;

class BubbleFunction{
	void input(int arr[]) {
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+i+" th element");
			arr[i]=sc.nextInt();
			
		}
		
	}
	void BubbleFunction(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}	
		}

	}
}
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		BubbleFunction obj = new BubbleFunction();
		int n;
		System.out.println("Enter the number elements in array: ");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		obj.input(arr);
		obj.BubbleFunction(arr);
		for (int element : arr) { // Print sorted array using enhanced for loop
            System.out.print(element + " ");
        }

	}

}
