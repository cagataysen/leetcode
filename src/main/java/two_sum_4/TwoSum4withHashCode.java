package two_sum_4;

import java.util.HashMap;
import java.util.Map;

public class TwoSum4withHashCode {
    public int[] twoSum(int[] nums, int target) {

        //remaining = target - nums[i]

        int remaining;
        Map<Integer, Integer> values = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            remaining = target - nums[i];

            if(values.containsKey(remaining)){
                return new int[]{i, values.get(remaining)};
            }

            values.put(nums[i] ,i);

        }
        return new int[0];

    }
}
