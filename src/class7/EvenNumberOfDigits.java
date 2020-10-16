package class7;

//Given an array nums of integers, return how many of them contain 
//an even number of digits.
public class EvenNumberOfDigits {
	public int findNumbers(int[] nums) {
		int count = 0;
		for (int var : nums) {
			int count1 = 0;
			while (var != 0) {
				var /= 10;
				count1++;
			}
			if (count1 % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}
