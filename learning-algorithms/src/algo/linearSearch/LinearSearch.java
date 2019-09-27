package algo.linearSearch;

public class LinearSearch {

	public static int linearSearch(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println(arr[i] + " is present at index " + i);
				return i;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 7, 13, 10 };
		if ((linearSearch(arr, 5) == -1)) {
			System.out.println("Element not preset in the list");
		}
	}
}
