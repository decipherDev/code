public class MergeTwoSortedArrays {
	public static void main(String[] args) {
		int[] arr1 = new int[] { -1, 1, 3, 5, 7, 9 };
		int[] arr2 = new int[] { -2, 2, 3, 4, 5, 6 };
		int[] output = mergeArrays(arr1, arr2);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}

	}

	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		int[] sortedArray = new int[arr1.length + arr2.length];
		int i = 0, j = 0, count = 0;
		while (count < sortedArray.length) {
			if (i < arr1.length && j < arr2.length) {
				sortedArray[count++] = arr1[i] > arr2[j] ? arr2[j++] : arr1[i++];
			} else if (i == arr1.length) {
				sortedArray[count++] = arr2[j++];
			} else {
				sortedArray[count++] = arr1[i++];
			}
		}
		return sortedArray;
	}
}