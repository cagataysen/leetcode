package valid_anagram;

import java.util.*;

public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charMapForS = new LinkedHashMap<>();
        Map<Character, Integer> charMapForT = new LinkedHashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (char c : s.toCharArray()) {
            charMapForS.put(c, charMapForS.getOrDefault(c, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            charMapForT.put(ch, charMapForT.getOrDefault(ch, 0) + 1);
        }

        for (char a : charMapForS.keySet()) {
            if (charMapForT.containsKey(a) && (charMapForT.get(a).equals(charMapForS.get(a)))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
        /*
        Set<Character> charSetS = new HashSet<>();
        Set<Character> charSetT = new HashSet<>();

        if(s.length() != t.length()){
            return false;
        }

        for(char c: s.toCharArray()){
            charSetS.add(c);
        }

        for(char ch: t.toCharArray()){
            charSetT.add(ch);
        }

        return charSetS.equals(charSetT);
    }

*/

