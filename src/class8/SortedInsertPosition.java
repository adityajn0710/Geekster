package class8;

//Given a sorted array A and a target value B, return the index if the 
//target is found. If not, return the index where it would be if it were inserted in order.
//You may assume no duplicates in the array.

public class SortedInsertPosition {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6 };
		int num = 5;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num || arr[i] > num) {
				System.out.println(i);
				break;
			}
		}

	}

}
