package class11;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 1, 5, -1, 10, 0, 100, 67, -47 };
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int swap = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = swap;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
