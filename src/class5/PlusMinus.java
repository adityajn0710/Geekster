package class5;

public class PlusMinus {
	static void plusMinus(int[] arr) {
		int pos = 0, neg = 0, zero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zero++;
				continue;
			} else if (arr[i] > 0) {
				pos++;
				continue;
			} else {
				neg++;
				continue;
			}
		}
		System.out.println((float) pos / arr.length);
		System.out.println((float) neg / arr.length);
		System.out.println((float) zero / arr.length);
	}
}
