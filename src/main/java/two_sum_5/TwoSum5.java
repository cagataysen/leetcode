package two_sum_5;

import java.util.HashMap;
import java.util.Map;


public class TwoSum5 {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numsMap = new HashMap<>();
        int remaining;

        for(int i = 0; i < nums.length; i++){
           remaining = target - nums[i];
           if(numsMap.containsKey(remaining)){
               return new int[] {numsMap.get(remaining), i};
           }
           else{
               numsMap.put(nums[i], i);
           }
        }

        return new int[0];

    }
}
