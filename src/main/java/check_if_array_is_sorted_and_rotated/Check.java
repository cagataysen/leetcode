package check_if_array_is_sorted_and_rotated;

public class Check {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[(i + 1) % nums.length]){
                count++;
            }
        }
        return count < 2;
    }
}
