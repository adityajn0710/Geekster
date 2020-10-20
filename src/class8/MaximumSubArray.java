package class8;

public class MaximumSubArray {

	public int maxSubArray(int[] nums) {
        int maxSum = 0, max = 0, neg = Integer.MIN_VALUE;
        boolean pos = false;
            
        for (int i = 0 ; i < nums.length ; i++){
            maxSum += nums[i];
            if (maxSum >= 0){
                pos = true;
            }
            if (maxSum < 0){
                maxSum = 0;
            }
            max = Math.max(max,maxSum);
            neg = Math.max(nums[i],neg);
        }
        if (pos == false){
             return neg;
        }
           
        return max;
    }
}
