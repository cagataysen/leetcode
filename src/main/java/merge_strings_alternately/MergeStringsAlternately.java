package merge_strings_alternately;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        int size1 = word1.length();
        int size2 = word2.length();
        StringBuilder result = new StringBuilder("");

        while(i < size1 || j < size2){
            if(i != size1){
                result.append(word1.charAt(i));
                i++;
            }
            if(j != size2){
                result.append(word2.charAt(j));
                j++;
            }
        }

        return result.toString();
    }
}
