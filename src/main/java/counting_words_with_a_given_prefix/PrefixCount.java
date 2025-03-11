package counting_words_with_a_given_prefix;

import java.util.ArrayList;
import java.util.List;

public class PrefixCount {

    public int prefixCount(String[] words, String pref) {

        int count = 0;

        for(String word: words){
            if(word.contains(pref)){
                int length = pref.length();
                if(word.substring(0, length).equals(pref)){
                    count++;
                }

            }
        }

        return count;

    }


    public int prefixCount2(String[] words, String pref) {

        int count = 0;

        for(String word: words){
            if(word.startsWith(pref)){
                    count++;
            }
        }

        return count;

    }

}
