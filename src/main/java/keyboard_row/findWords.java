package keyboard_row;

import java.util.ArrayList;
import java.util.List;

class findWords {
    public String[] findWords(String[] words) {
        //define and store characters which are at the same line
        String qLine = "qwertyuiop";
        String aLine = "asdfghjkl";
        String zLine = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for(String word: words){
            String lowerWord = word.toLowerCase();
            String containingLine = null;

            char firstChar = lowerWord.charAt(0);

            if(qLine.indexOf(firstChar) != -1){
                containingLine = qLine;
            }
            else if(aLine.indexOf(firstChar) != -1){
                containingLine = aLine;
            }
            else if(zLine.indexOf(firstChar) != -1){
                containingLine = zLine;
            }

            boolean valid = true;

            for(int i = 1; i < lowerWord.length(); i++){
                if(containingLine.indexOf(lowerWord.charAt(i)) == -1){
                    valid = false;
                    break;
                }
            }

            if(valid){
                result.add(word);
            }

        }
        return result.toArray(new String[result.size()]);
    }
}