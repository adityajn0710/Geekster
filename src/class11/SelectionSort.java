package class11;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 1, 5, -1, 10 };
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) { // change to > for decreasing order
					index = j;// searching for lowest index
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
