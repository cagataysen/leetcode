package remove_duplicates_from_sorted_array;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
