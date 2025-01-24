package group_Anagrams_medium;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        //make each word sorted by using char arrays
        for (String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);

        }

        return new ArrayList<>(map.values());


    }


    public static void main(String[] args) {
        String[] input = {"eat","tea","tan","ate","nat","bat"};

        GroupAnagrams groupAnagrams = new GroupAnagrams();
        groupAnagrams.groupAnagrams(input);
    }

}


