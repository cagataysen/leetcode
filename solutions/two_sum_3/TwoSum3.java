public class TwoSum3 {
    public int[] twoSum(int[] nums, int target) {
        //target - nums[i] - nums[j] = 0

        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] - nums[j] == 0) {
                    result[0] = i;
                    result[1] = j;
                    break;

                }
            }
        }
        return result;
    }
}
