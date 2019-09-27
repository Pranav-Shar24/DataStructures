package algo.binarySearch;

public class BinarySearch {

	public static int binarySearch(int arr[],int key) {
		int start = 0;
		int last = arr.length - 1;
 
		while (start <= last) {
			int middle = (start+last)/2;
			if (key < arr[middle]) {
				last = middle - 1;
			} else if (key > arr[last]) {
				start = last + 1;
			} else {
				return middle;
			}
		}
		return -1;
		}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 7, 13, 10 };
		System.out.println(binarySearch(arr,5));
	}

}
