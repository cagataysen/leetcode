package longest_strictly_increasing_or_strictly_decreasing_subarray;

import java.util.Map;

public class LongestMonotonicSubarray {
    public int longestMonotonicSubarray(int[] nums) {
            int maxIncreasing = 1, currentIncreasing = 1;
            int maxDecreasing = 1, currentDecreasing = 1;

            for(int i = 1; i < nums.length; i++){
                   if(nums[i] > nums[i-1]){
                       currentIncreasing++;
                       currentDecreasing = 1;
                   } else if (nums[i] < nums[i-1]) {
                       currentDecreasing++;
                       currentIncreasing = 1;
                   } else{
                       currentIncreasing = 1;
                       currentDecreasing = 1;
                   }

                    maxIncreasing = Math.max(currentIncreasing, maxIncreasing);
                    maxDecreasing = Math.max(currentDecreasing, maxDecreasing);
            }



            return Math.max(maxIncreasing, maxDecreasing);


    }
}
