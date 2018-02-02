public class Chapter6_MergeSortDemo {

	public static void main(String[] args) {
		int[] integerArray = {1, 56, 789, 234, 5, 10, 34, 25, 26, 78};
		Chapter6_MergeSort.sort(integerArray, 0, integerArray.length);
		System.out.println("Sorted Array Is: ");
		for (Integer i : integerArray) {
			System.out.print(i + " ");
		}
	}

}
