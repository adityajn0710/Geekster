package recursion3;

import java.util.ArrayList;

public class restAllinOne {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println(subsequence(arr, 0));
		int[] array = { 0, 1, 2 };
		System.out.println(permutations(array, 0));
		numberOfPath2DRestricted(1, 1, 3, "");
		System.out.println();
		System.out.println(numberOfPath2D(3, 3));
		System.out.println(pathNoDiagonal(3, 3));
	}
	public static ArrayList<String> pathNoDiagonal(int n, int m) {
		if (n == 1 && m == 1) {
			ArrayList<String> result = new ArrayList<>();
			result.add("");
			return result;
		} else if (n < 1 || m < 1) {
			ArrayList<String> result = new ArrayList<>();
			return result;
		}

		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> res = new ArrayList<>();
		res = pathNoDiagonal(n - 1, m);
		for (String s : res) {
			result.add("V" + s);
		}
		res = pathNoDiagonal(n, m - 1);
		for (String s : res) {
			result.add("H" + s);
		}
		return result;
	}
	public static ArrayList<String> numberOfPath2D(int n, int m) {
		if (n == 1 && m == 1) {
			ArrayList<String> result = new ArrayList<>();
			result.add("");
			return result;
		} else if (n < 1 || m < 1) {
			ArrayList<String> result = new ArrayList<>();
			return result;
		}

		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> res = new ArrayList<>();
		res = numberOfPath2D(n - 1, m);
		for (String s : res) {
			result.add("V" + s);
		}
		res = numberOfPath2D(n, m - 1);
		for (String s : res) {
			result.add("H" + s);
		}
		res = numberOfPath2D(n - 1, m - 1);
		for (String s : res) {
			result.add("D" + s);
		}
		return result;
	}

	public static ArrayList<String> permutations(int[] arr, int index) {
		if (index > arr.length - 1) {
			ArrayList<String> result = new ArrayList<>();
			result.add("");
			return result;
		}
		ArrayList<String> res = permutations(arr, index + 1);
		ArrayList<String> result = new ArrayList<>();
		for (String s : res) {
			for (int i = 0; i <= s.length(); i++) {
				String pre = s.substring(0, i);
				String suf = s.substring(i);
				result.add(pre + Integer.toString(arr[index]) + suf);
			}
		}
		return result;
	}

	public static void numberOfPath2DRestricted(int n, int m, int ques, String ans) {
		if (n > ques || m > ques) {
			return;
		}
		if (n == ques && m == ques) {
			System.out.print(ans + " ");
		}

		numberOfPath2DRestricted(n + 1, m, ques, ans + "H");
		numberOfPath2DRestricted(n, m + 1, ques, ans + "V");
		if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'D') {
			numberOfPath2DRestricted(n + 1, m + 1, ques, ans + "D");
		}
	}

	public static ArrayList<String> subsequence(int[] arr, int index) {
		if (index > arr.length - 1) {
			ArrayList<String> result = new ArrayList<>();
			result.add("");
			return result;
		}
		ArrayList<String> res = subsequence(arr, index + 1);
		ArrayList<String> result = new ArrayList<>();
		for (String i : res) {
			result.add(i);
			result.add(Integer.toString(arr[index]) + i);
		}
		return result;
	}

}
