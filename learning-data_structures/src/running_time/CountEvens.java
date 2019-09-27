package running_time;

public class CountEvens {

	public static int countEvens(int[] elements) {
		int count =0;
		for(int i =0 ; i < elements.length ; i++) {
			if(elements[i]%2==0) {
				count++;
			}
		}
		return count;
	}
	
	public static int getEelementsFrom(int arr[], int index) {
		
		return arr[index];
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(countEvens(arr));
		System.out.println(getEelementsFrom(arr, 5));
		
	}
}
// n = input size
//Linear = single loop O(n)
//constant = O(n)
//quadratic = loop inside a loop O(n^2)
//Exponential = O(n^n)