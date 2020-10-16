package class7;

//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1 ; i < nums.length ; i++){
            sum[i] = sum[i-1] + nums[i];
        }
        return sum;
    }
}
