package palindrome_number;

import java.util.*;


public class Palindrome {
    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }

        String stringX = String.valueOf(x);
        StringBuilder compare = new StringBuilder();

        for(int i = stringX.length() - 1; i >= 0 ; i--){
            compare.append(stringX.charAt(i));
        }

        return stringX.equals(String.valueOf(compare));
    }
}


