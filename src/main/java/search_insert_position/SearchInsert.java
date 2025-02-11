package search_insert_position;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int medium = (left + right) / 2;   //int medium = left + (right - left) / 2; // Avoids overflow

            if(target == nums[medium]){
                return medium;
            } else if (target < nums[medium]) {
                right = medium - 1;
            } else if (target > nums[medium]) {
                left = medium + 1;
            }
        }

        return left;
    }
}
