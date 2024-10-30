package vinsys;
class SelectionFunction{
	 static void display(int arr[]) {
	        for (int i=0;i<arr.length;i++) {
	            System.out.println(arr[i]+" ");
	        }
	    }

	 void selectionSort(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
        	int min =i;
        	for(int j=i+1;j<n;j++) {
        		if(arr[j]<arr[min]) {
        			min=j;
        		}
        		
        	}
        	 int temp = arr[min];
             arr[min] = arr[i];
             arr[i] = temp;
        }
}
 }
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionFunction obj = new SelectionFunction();
		int[] ar = {6, 5, 4, 3, 2, 1};
        obj.selectionSort(ar);
        obj.display(ar);

	}

}
