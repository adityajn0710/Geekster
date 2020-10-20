package class11;

import java.util.Arrays;

public class chocolate {

	public static void main(String[] args) {
		int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
		int m = 5;
		int minDiff = Integer.MAX_VALUE;
		Arrays.sort(arr);

		for (int i = 0; i + m - 1 < arr.length -1; i++) {
			int diff = arr[i + m - 1] - arr[i];
			minDiff = Math.min(minDiff, diff);
		}
		System.out.println(minDiff);

	}

}
