package majority_element;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementSolution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> frequencyMap = new HashMap<>(); //Number, Frequency
        for(int i: nums){
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
            if(frequencyMap.get(i) > (n / 2)){
                return i;
            }
        }
        return -1;

    }
}
