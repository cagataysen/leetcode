import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {

            Map<Integer, Integer> indexAndValues = new HashMap<Integer,Integer>();

            for(int i = 0; i < nums.length; i++){
                int remaining = target - nums[i];

                if(indexAndValues.containsKey(remaining)){
                    return new int[]{i, indexAndValues.get(remaining)};
                }
                indexAndValues.put(nums[i], i);
            }

            return new int[0];
        }
}
