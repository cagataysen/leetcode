package word_pattern;

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if(words.length != pattern.length()){
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(charToWord.containsKey(c) && !charToWord.get(c).equals(word)){
                return false;
            }

            if(wordToChar.containsKey(word) && wordToChar.get(word) != c){
                return false;
            }

            charToWord.put(c, word);
            wordToChar.put(word, c);
        }

        return true;

    }
}
