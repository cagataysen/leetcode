package solutions.count_the_number_of_consistent_strings;

import java.util.HashSet;
import java.util.Set;

public class CountConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> characterSet = new HashSet<>();

        int count = 0;
        for(char c: allowed.toCharArray()){
            characterSet.add(c);
        }


        for(String word: words){
            boolean illegal = false;
            for(int i = 0; i < word.length(); i++){
                if(characterSet.contains(word.charAt(i))){
                    continue;
                }
                else{
                    illegal = true;
                }
            }
            if(!illegal){
                count++;
            }

        }

        return count;
    }
}
