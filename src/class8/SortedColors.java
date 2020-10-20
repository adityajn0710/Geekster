package class8;

public class SortedColors {

	public void sortColors(int[] nums) {
		int zero = 0, one = 0, i = 0;
		for (i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				zero++;
			} else if (nums[i] == 1)
				one++;
		}
		for (i = 0; i < nums.length; i++) {
			if (i < zero)
				nums[i] = 0;
			else if (i >= zero && i < zero + one)
				nums[i] = 1;
			else
				nums[i] = 2;
		}
		for (i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}

}
