package algo.recursion;

public class RecursiveLinearSearch {

	public static void main(String[] args) {
		
		int arr[] = {2,5,3,9,8,10,1,4,6};
		int key = 10;
		int indexStartPoint =0;
		recurisveLinearSearch(arr, indexStartPoint, key);
	}
	
	public static int recurisveLinearSearch(int arr[], int indexPos , int key) {
		if(indexPos > arr.length-1) { // if evaluates to be true, then element is not present in Array
			return -1;
		}
		else if(arr[indexPos] == key) {
			System.out.println(key +" is present at index " + indexPos);
			return indexPos;
		}
		else {
			//System.out.println("Index at pos " + indexPos);
			return recurisveLinearSearch(arr, indexPos +1, key);
		}
	}

}
