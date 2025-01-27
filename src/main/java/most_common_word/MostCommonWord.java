package most_common_word;

import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedSet = new HashSet<>();

        for (String s : banned) {
            bannedSet.add(s.toLowerCase());
        }

        HashMap<String, Integer> wordMap = new HashMap<>();

        String[] words = paragraph.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!bannedSet.contains(word)) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }

        String trendWord = "";
        int maxCount = 0;
        for (String word : wordMap.keySet()) {
            if (wordMap.get(word) > maxCount) {
                trendWord = word;
                maxCount = wordMap.get(word);
            }
        }

        return trendWord;

    }
}
