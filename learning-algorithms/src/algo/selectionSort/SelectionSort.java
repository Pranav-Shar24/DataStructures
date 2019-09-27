package algo.selectionSort;

public class SelectionSort {

	public static int[] selectionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int minimum = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minimum]) {
					minimum =j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minimum];
			arr[minimum] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = {23,45,2,14,34,7,34,1};
		display(arr);
		System.out.println("\nAfter selection Sort");
		display(selectionSort(arr));
	}
	
	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
