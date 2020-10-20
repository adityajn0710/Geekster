package class8;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for (int i = nums.length-1 ; i >= 0 ; i--){
            if (nums[i] == 0){
                for (int j = i ; j < nums.length-1 ; j++){
                    int swap = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = swap;
                }
            }
        }
        for (int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i]);
        }
    }
}
