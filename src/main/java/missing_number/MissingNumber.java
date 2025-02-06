package missing_number;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int max = nums[0];
        int n = 0;

        for(int num: nums){
            if(num > max){
                max = num;
            }
            n++;

        }
        if(n != max){
            return n;
        }

        Arrays.sort(nums);
        for(int i = 1; i < n; i++){
            if(nums[i] - nums[i-1] != 1){
                return nums[i] - 1;
            }
        }

        return 0;


    }
}
