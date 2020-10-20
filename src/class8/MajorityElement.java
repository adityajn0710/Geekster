package class8;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int check = 1;
        int major = nums[0];
        for (int i = 1 ; i < nums.length ; i++){
            if (nums[i] == major){
                check++;
            }
            else{
                check--;
            }
            if (check == 0){
                major = nums[i];
                check = 1;
            }
        }
        return major;
    }
}
