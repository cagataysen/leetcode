import java.util.HashMap;

public class Solution4Faster {
    public int[] twoSumWithHashMap(int[] nums, int target) {

        HashMap<Integer, Integer> input = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            input.put(nums[i], i);   //{2,0} {7,1} {11,2} {15,3}
        }

        for(int i = 0; i < nums.length; i++) {
            int secondNumber = target - nums[i];

            if(input.containsKey(secondNumber) && input.get(secondNumber) != i) {
                return new int[] {i, input.get(secondNumber)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }

}
