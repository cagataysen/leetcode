package longest_common_prefix;

import java.util.HashMap;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if( strs == null || strs.length == 0){
            return "";
        }

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }

        return prefix;
    }
}


/*
* "ab", "abc"
*
* prefix = "ab"
*
* while(strs[i].indexOf(prefix) != 0) ==> checking if strs[1] is also starting with "ab" which is yes
*
* if it wouldn't
*
* "abc", "ack"
*
* prefix = prefix.substring(0, prefix.length() - 1); ==> decrease the length of prefix and check again
*
*
*
* */