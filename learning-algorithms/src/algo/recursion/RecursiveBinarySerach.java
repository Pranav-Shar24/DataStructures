package algo.recursion;

public class RecursiveBinarySerach {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 3, 9, 8, 10, 1, 4, 6 };
		int indexEndPoint = arr.length - 1;

		// System.out.println(indexEndPoint);
		System.out.println(recursiveBinarySearch(arr, 0, indexEndPoint, 1));
		System.out.println(recursiveBinarySearchi(arr, 0, indexEndPoint, 5));

	}

	public static int recursiveBinarySearch(int arr[], int startIndex, int lastIndex, int key) {
		System.out.println("[ "+ startIndex + "..." + lastIndex + " ]");
		if (startIndex > lastIndex) {
			return -1;
		} else {
			int middlePos = (startIndex + lastIndex) / 2;
			if (arr[middlePos] == key) {
				return middlePos;
			} else if (arr[middlePos] > key) {
				return recursiveBinarySearch(arr, startIndex, middlePos - 1, key);
			} else {
				return recursiveBinarySearch(arr, middlePos + 1, lastIndex, key);
			}
		}
	}
	
	public static int recursiveBinarySearchi(int [] a, int p, int r, int x){
		System.out.println("[ "+ p + "..." + r + " ]");
		if( p > r){
			return -1;
		} else{
			int q = (p+r)/2;
			if(a[q] == x){
				return q;
			} else if (a[q] > x){
				return recursiveBinarySearch(a, p, q-1, x);
			} else{
				return recursiveBinarySearch(a, q+1, r, x);
			}
		}
	}

}
