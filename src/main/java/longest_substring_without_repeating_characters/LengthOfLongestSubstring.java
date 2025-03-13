package longest_substring_without_repeating_characters;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        String longest = "";
        String tempLongest = "";

        for(char letter: s.toCharArray()){
            if(tempLongest.contains(Character.toString(letter))){
                tempLongest = tempLongest.substring(tempLongest.indexOf(letter) + 1);
            }
            tempLongest += letter;

            if(tempLongest.length() > longest.length()){
                longest = tempLongest;
            }

        }


        return longest.length();

    }
}
