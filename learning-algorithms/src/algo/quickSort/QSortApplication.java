package algo.quickSort;

import java.util.Arrays;

public class QSortApplication {

	public static void main(String[] args) {
		int[] inputArray = { 12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4 };
		quickSort(inputArray, 0, inputArray.length - 1);

		System.out.print(Arrays.toString(inputArray));
	}

	private static void quickSort(int[] inputArray, int start, int end) {
		if (start < end) {
			int pivotPoint = partition(inputArray, start, end); // index position of the correctly placed value in the
																// array
			quickSort(inputArray, start, pivotPoint - 1);// sorts the left half of the range
			quickSort(inputArray, pivotPoint + 1, end);// sorts the right half of the range
		}

	}

	private static int partition(int[] inputArray, int start, int end) {

		int pivot = inputArray[end];
		int i = start - 1;
		for (int j = start; j <= end - 1; j++) {
			if (inputArray[j] <= pivot) {
				i++;

				// we are swapping below:
				int ival = inputArray[i];
				int jval = inputArray[j];

				inputArray[i] = jval;
				inputArray[j] = ival;

			}
		}

		// put the pivot value in the correct slot next

		int ival = inputArray[i + 1];
		inputArray[end] = ival;
		inputArray[i + 1] = pivot; // here, pivot value is placed in the correct slot of the array.
		return i + 1;
	}

}
