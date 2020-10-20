package class9;

public class CrushProblem {
	public static void main(String[] args) {
		int[][] queries = { { 2, 3, 603 }, { 1, 1, 286 }, { 4, 4, 882 } };
		long arr = arrayManipulation(10, queries);
		System.out.println(arr);
	}

	static long arrayManipulation(int n, int[][] queries) {
		long[] arr = new long[n];

		int size = queries.length;
		for (int i = 0; i < size; i++) {
			arr[queries[i][0]] = arr[queries[i][0]] + queries[i][2];
			if (queries[i][1] + 1 < n) {
				arr[queries[i][1] + 1] = arr[queries[i][1] + 1] - queries[i][2];
			}
		}
		long max = arr[0];
		for (int i = 1; i < n; i++) {
			arr[i] += arr[i - 1];
			max = Math.max(arr[i], max);
		}
		return max;

	}
}
