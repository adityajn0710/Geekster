package class7;

//Given an array of size n, find the majority element. 
//The majority element is the element that appears more than ( n/2 ) times.

public class MajorityElements {
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
