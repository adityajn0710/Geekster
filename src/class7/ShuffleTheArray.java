package class7;

//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].

public class ShuffleTheArray {

	public int[] shuffle(int[] nums, int n) {
		int[] ans = new int[2 * n];
		int j = 0;
		for (int i = 0; i < 2 * n; i += 2) {
			ans[i] = nums[j];
			ans[i + 1] = nums[n + j];
			j++;
		}
		return ans;
	}

}
