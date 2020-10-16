package class5;

public class MiniMaxSum {
	static void miniMaxSum(int[] arr) {
		long sumMax = 0, sumMin = 0;
		sumMax = (long) arr[0] + arr[1] + arr[2] + arr[3];
		sumMin = sumMax;
		for (int i = 0; i < 5; i++) {
			long sum = 0;
			for (int j = 0; j < 5; j++) {
				if (i != j) {
					sum += arr[j];
				}
			}
			if (sum > sumMax) {
				sumMax = sum;
			} else if (sum < sumMin) {
				sumMin = sum;
			}
		}
		System.out.print(sumMin + " " + sumMax);

	}
}
