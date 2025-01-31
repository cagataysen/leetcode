package two_sum_ii_input_array_is_sorted;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIISolution {
    public int[] twoSum(int[] numbers, int target) {

        int l = 0, r = numbers.length - 1;

        while(l < r){
            int curSum = numbers[l] + numbers[r];

            if(curSum > target){
                r--;
            } else if (curSum < target) {
                l++;
            }
            else{
                return new int[] { l + 1, r + 1 };
            }
        }

        return new int[0];

        /*
        //Binary search
        for(int i = 0; i < numbers.length; i++){
                int l = i + 1, r = numbers.length - 1;
                int tmp = target - numbers[i];
                while(l <= r){
                    int mid = l + (r - l) / 2;
                    if (numbers[mid] == tmp) {
                        return new int[] {i + 1, mid + 1};
                    } else if (numbers[mid] < tmp) {
                        l = mid + 1;
                    }
                    else{
                        r = mid - 1;
                    }
                }
        }
        return new int[0];
*/
    }
}
