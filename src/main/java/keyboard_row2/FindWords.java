package keyboard_row2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindWords {
    public String[] findWords(String[] words) {

        List<String> result = new ArrayList<>();

        String firstRow= "qwertyuiop";
        String secondRow= "asdfghjkl";
        String thirdRow= "zxcvbnm";

        Set<Character> row1 = new HashSet<>();
        Set<Character> row2 = new HashSet<>();
        Set<Character> row3 = new HashSet<>();

        for(char c: firstRow.toCharArray()){
            row1.add(c);
        }
        for(char c: secondRow.toCharArray()){
            row2.add(c);
        }
        for(char c: thirdRow.toCharArray()){
            row3.add(c);
        }

        for(String word: words){
            String lowerWord = word.toLowerCase();
            boolean inRow1 = true;
            boolean inRow2 = true;
            boolean inRow3 = true;

            for (int i = 0; i < lowerWord.length(); i++){
                char c = lowerWord.charAt(i);
                if(!row1.contains(c)) {
                    inRow1 = false;
                }
                if (!row2.contains(c)) {
                    inRow2 = false;
                }
                if (!row3.contains(c)) {
                    inRow3 = false;
                }
            }

            if (inRow1 && !inRow2 && !inRow3) {
                result.add(word);
            } else if (!inRow1 && inRow2 && !inRow3) {
                result.add(word);
            } else if (!inRow1 && !inRow2 && inRow3) {
                result.add(word);
            }


        }

        return result.toArray(new String[0]);


    }
}
