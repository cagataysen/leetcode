package count_pairs_whose_sum_is_less_than_target;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CountPairs {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int left = 0, right = nums.size() - 1;
        int count = 0;

        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                count += (right - left); // Count all pairs with nums[left] --- We dont need to make left side iterations, they will be valid
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    /*
    *BRUTE FORCE
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int size = nums.size();

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;

    }
    */

}
