package algo.insertionSort;

public class Application {

	public static void main(String[] args) {

		int arr[] = {2,6,3,72,1,2,4,7,9};
		display(insertionSort(arr));
	}
	
	public static int [] insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int element = arr[i];// contains the data that needs to be shifted in sorted area
			int j = i-1; // will point to the index position of the last value in sorted area
			while(j>=0 && arr[j] > element) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = element;
		}
		return arr;
	}
	
	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
