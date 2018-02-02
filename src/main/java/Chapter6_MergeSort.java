public class Chapter6_MergeSort {

	public static void sort(int[] arrayToSort, int lowIndex, int highIndex) {
		int N = highIndex - lowIndex;
		if(highIndex - lowIndex <= 1) return;
		int midIndex = lowIndex + N/2;

		// recursively sort
		sort(arrayToSort, lowIndex, midIndex);
		sort(arrayToSort, midIndex, highIndex);

		// Merge sorted sub arrays
		int[] temp = new int[N];
		int i = lowIndex;
		int j = midIndex;

		for(int k = 0; k < N; ++k) {
			if(i == midIndex) {
				temp[k] = arrayToSort[j++];
			} else if (j == highIndex){
				temp[k] = arrayToSort[i++];
			} else if (arrayToSort[j] < arrayToSort[i]) {
				temp[k] = arrayToSort[j++];
			} else {
				temp[k] = arrayToSort[i++];
			}
		}
		for (int k = 0; k < N; k++) {
			arrayToSort[lowIndex + k] = temp[k];
		}

	}
}
