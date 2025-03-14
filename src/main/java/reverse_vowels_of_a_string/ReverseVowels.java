package reverse_vowels_of_a_string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseVowels {
    public String reverseVowels(String s) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        List<Character> vowelInText = new ArrayList<>();
        char[] chars = s.toCharArray();

        for(char c: chars){
            if(vowels.contains(c)){
                vowelInText.add(c);
            }
        }

        //reverse vowelInText
        Collections.reverse(vowelInText);

        //put them back where there is a vowel in same order
        int index = 0;
        for(int i = 0; i < chars.length; i++){
            if(vowels.contains(s.charAt(i))){
                chars[i] = vowelInText.get(index);
                index++;
            }
        }

        return new String(chars);

    }
}
