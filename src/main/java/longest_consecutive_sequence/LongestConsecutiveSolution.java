package longest_consecutive_sequence;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutiveSolution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> numberSet = new HashSet<>();
        int longest = 0;

        for(int i: nums){
            numberSet.add(i);
        }

        for(int num: numberSet){
            if(!numberSet.contains(num-1)){
                int length = 1;
                while(numberSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }

        }
        return longest;

    }
}
