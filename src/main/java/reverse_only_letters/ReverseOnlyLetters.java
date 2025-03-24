package reverse_only_letters;

import java.util.Arrays;
import java.util.Collections;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length() - 1;

        char[] input = s.toCharArray();

        while(left <= right){
            if(!isEnglishLetter(input[left])){
                left++;
            } else if(!isEnglishLetter(input[right])){
                right--;
            } else{
                char temp = input[left];
                input[left] = input[right];
                input[right] = temp;

                left++;
                right--;
            }
        }

        return new String(input);
    }

    public boolean isEnglishLetter(Character c){
        return Character.isLetter(c);
    }

    public static void main(String[] args) {
        ReverseOnlyLetters obj = new ReverseOnlyLetters();
        System.out.println(obj.reverseOnlyLetters("a-bC-dEf-ghIj")); // Expected: "j-Ih-gfE-dCba"
    }
}
