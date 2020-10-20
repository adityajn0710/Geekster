package class11;

import java.util.Arrays;

public class Intersection {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		int[] arr = intersection(nums1, nums2);
		for (int i = 0; i < nums2.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		int n1 = nums1.length;
		int n2 = nums2.length;
		int n = 0;
		if (n1 > n2) {
			n = n2;
		} else {
			n = n1;
		}
		int[] ans = new int[n];
		int count = 0;
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		for (int i = 0; i < nums1.length; i++) {
			int l = 0;
			int r = nums2.length - 1;
			while (l != r) {
				int m = (l + r) / 2;
				if (nums1[i] == nums2[m]) {
					ans[count] = nums1[i];
					count++;
				}
				if (nums1[i] > nums2[m]) {
					l = m;
				} else {
					r = m;
				}
			}
		}
		return ans;
	};

}
