package ransom_note;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> magazineMap = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            magazineMap.put(ch, magazineMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ransomNote.toCharArray()) {
            if(!magazineMap.containsKey(ch) || magazineMap.get(ch) == 0){
                return false;
            }
            magazineMap.put(ch, magazineMap.get(ch) - 1);
        }

       return true;

    }

}
