package MinimumNumberOfOperationsToMakeElementsInArrayDistinct;

import java.util.*;

public class MinimumOperations {

    public int minimumOperations(int[] nums){

        Map<Integer, Integer> countMap = new HashMap<>(); //number - frequency

        //building map for counting duplicates
        for(int value: nums){
            countMap.put(value, countMap.getOrDefault(value, 0) + 1);
        }

        //
        int totalDuplicates = 0;
        for (int count : countMap.values()) {
            if (count > 1) {
                totalDuplicates += count - 1;
            }
        }

        int operationCount = 0;
        while (totalDuplicates > 0) {
            if (nums.length >= 3) {
                // Create a new array excluding the first three elements
                int[] newArray = new int[nums.length - 3];
                System.arraycopy(nums, 3, newArray, 0, newArray.length);
                nums = newArray;
            } else {
                nums = new int[0];  // Clear the array
            }

            // Recalculate frequencies after removal
            countMap.clear();
            for (int value : nums) {
                countMap.put(value, countMap.getOrDefault(value, 0) + 1);
            }

            // Recalculate duplicates
            totalDuplicates = 0;
            for (int count : countMap.values()) {
                if (count > 1) {
                    totalDuplicates += count - 1;
                }
            }

            operationCount++;
        }

        return operationCount;


    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2,3,3,5,7};

        MinimumOperations minimumOperations = new MinimumOperations();
        minimumOperations.minimumOperations(nums);
    }

}
