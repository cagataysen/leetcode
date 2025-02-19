package first_unique_character_in_a_string;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        Map<Character, Integer> inputMap = new HashMap<>();

        for(char c: s.toCharArray()){
            int count = 0;
            inputMap.put(c, inputMap.getOrDefault(c, count) + 1);
        }

        int index = 0;
        for(char ch: s.toCharArray()){
            if(inputMap.get(ch) == 1){
                return index;
            }
            else{
                index++;
            }
        }

        return -1;
    }
}
