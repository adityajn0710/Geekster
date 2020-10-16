package class5;

public class DiagonalDifference {

	public static int diagonalDifference(List<List<Integer>> arr) {
		int sumL = 0, sumR = 0;
		int i = 0, j = 0;
		int width = arr.size();
		int length = arr.get(0).size();
		for (i = 0; i < length; i++) {
			sumL += arr.get(i).get(i);
		}
		for (i = 0; i < length; i++) {
			for (j = width - 1; j >= 0; j--) {
				if (i + j == width - 1) {
					sumR += arr.get(i).get(j);
					continue;
				}
			}
		}
		int diff = Math.abs(sumL - sumR);
		return diff;
	}
}
