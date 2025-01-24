package uncommon_words_from_two_sentences;

import java.util.HashMap;
import java.util.Map;

public class UncommonFromSentencesSolution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] wordsS1 = s1.split(" ");
        String[] wordsS2 = s2.split(" ");

        Map<String, Integer> wordMap = new HashMap<>();
        for(String s: wordsS1){
            wordMap.put(s, wordMap.getOrDefault(s, 0) + 1);
        }
        for(String s: wordsS2){
            wordMap.put(s, wordMap.getOrDefault(s, 0) + 1);
        }

        wordMap.entrySet().removeIf(entry -> entry.getValue() != 1);


        String[] result = new String[wordMap.size()];
        int i = 0;
        for(String el: wordMap.keySet()){
            result[i++] = el;
        }

        return result;

    }
}
