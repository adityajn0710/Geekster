package recursion2;

public class allinOne {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 3, 3, 3, 4, 1, 3, 4 };
		System.out.println(findAny(arr,0,3));
		System.out.println(firstIndex(arr, 0, 3));
		System.out.println(findLastIndex(arr, 0, 3));
		System.out.println(findMax(arr, 0));
		System.out.println(findMin(arr, 0));
		printArr(arr,0);
		System.out.println();
		printReverse(arr,0);
	}
	
	public static void printReverse(int[] arr, int index) {
		if (index == arr.length) {
			return;
		}
		printReverse(arr, index + 1);
		System.out.print(arr[index] + " ");
	}
	public static void printArr(int[] arr, int index) {
		if (index == arr.length) {
			return;
		}
		System.out.print(arr[index] + " ");
		printArr(arr, index + 1);
	}
	public static int findMin(int[] arr, int index) {
		if (index == arr.length - 1) {
			return arr[index];
		}
		int ans = findMax(arr, index + 1);
		if (arr[index] < ans) {
			return arr[index];
		}
		return ans;
	}
	public static int findMax(int[] arr, int index) {
		if (index == arr.length - 1) {
			return arr[index];
		}
		int ans = findMax(arr, index + 1);
		if (arr[index] > ans) {
			return arr[index];
		}
		return ans;
	}

	public static int firstIndex(int[] arr, int index, int data) {
		if (index == arr.length) {
			return -1;
		}
		if (arr[index] == data) {
			return index;
		}
		int ans = firstIndex(arr, index + 1, data);
		return ans;
	}

	public static int findLastIndex(int[] arr, int index, int data) {
		if (index == arr.length) {
			return -1;
		}
		int ans = findLastIndex(arr, index + 1, data);
		if (ans != -1) {
			return ans;
		} else {
			if (arr[index] == data) {
				return index;
			} else
				return -1;
		}
	}
	public static int findAny(int[] arr, int index, int data) {
		if (index == arr.length) {
			return -1;
		}
		if (arr[index] == data) {
			return index;
		}
		int ans = firstIndex(arr, index + 1, data);
		return ans;
	}

}
