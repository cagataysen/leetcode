package solutions.single_number;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int count = 0;
        for(int num: nums){
            numMap.put(num, numMap.getOrDefault(num, count) + 1);
        }

        for(int i: numMap.keySet()){
            if(numMap.get(i) == 1){
                return i;
            }
        }

        return -1;
    }


}
