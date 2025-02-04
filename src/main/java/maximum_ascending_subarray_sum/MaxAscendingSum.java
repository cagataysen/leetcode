package maximum_ascending_subarray_sum;

public class MaxAscendingSum {
    public int maxAscendingSum(int[] nums) {
        int currMax = 0;
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){

            if (nums[i] > nums[i - 1]){
                if(currMax == 0){
                    currMax = nums[i-1];
                }
                currMax = currMax + nums[i];
            }
            else if(nums[i] < nums[i - 1]){
                if(currMax != 0){
                    currMax = 0;
                }
            }
            else if(nums[i] == nums[i - 1]){
                currMax = 0;
            }
            else{
                continue;
            }
            max = Math.max(currMax, max);
        }

        if(max == nums[0]){
            return nums[0];
        }

        return max;


    }
}

