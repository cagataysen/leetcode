package jewels_and_stones;

import java.util.HashMap;
import java.util.HashSet;

public class NumJewelsInStones {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewSet = new HashSet<>();
        for(char jewel: jewels.toCharArray()){
            jewSet.add(jewel);
        }

        int count = 0;
        for(char stone: stones.toCharArray()){
            if(jewSet.contains(stone)){
                count++;
            }
        }

        return count;

    }
}
