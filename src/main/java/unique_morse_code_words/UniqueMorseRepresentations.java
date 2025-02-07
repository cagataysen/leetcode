package unique_morse_code_words;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseRepresentations {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseAlphabet = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
                "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Map<Character, String> alphabetMap = new HashMap<>();
        int index = 0;
        for(char c = 'a'; c <= 'z'; c++){
            alphabetMap.put(c, morseAlphabet[index]);
            index++;
        }

        Set<String> resultSet = new HashSet<>();

        for(String word: words){
            StringBuilder morseConvertedVersion = new StringBuilder();
            for(int i = 0; i < word.length(); i++){
                char currentChar = word.charAt(i);
                morseConvertedVersion.append(alphabetMap.get(currentChar));
            }

            resultSet.add(morseConvertedVersion.toString());
        }

        return resultSet.size();
    }
}
