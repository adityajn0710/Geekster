package class5;

public class AVeryBigSum {
	static long aVeryBigSum(long[] ar) {
		int size = ar.length;
		long sum = 0;
		for (int i = 0; i < size; i++) {
			sum += ar[i];
		}
		return sum;
	}
}
