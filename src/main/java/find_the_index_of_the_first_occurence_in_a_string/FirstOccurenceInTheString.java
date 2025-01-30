package find_the_index_of_the_first_occurence_in_a_string;

import java.util.Hashtable;

public class FirstOccurenceInTheString {
    public int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);    solution 1

        //solution 2
        if (needle == null || needle.isEmpty()){
            return 0;
        }

        if (haystack == null || needle.length() > haystack.length()) {
            return -1;
        }

        for(int i = 0; i <= haystack.length() - needle.length(); i++){

            String sub = haystack.substring(i, i + needle.length());
            if(sub.equals(needle)){
                return i;
            }

        }
        return -1;
    }


}
