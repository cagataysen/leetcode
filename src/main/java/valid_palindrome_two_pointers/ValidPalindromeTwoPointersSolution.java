package valid_palindrome_two_pointers;

public class ValidPalindromeTwoPointersSolution {

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left <= right){
            if(!CheckValidLetter(s.charAt(left))){
                left++;
            } else if (!CheckValidLetter(s.charAt(right))) {
                right--;
            }
            else if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;

    }

    public static boolean CheckValidLetter(char c){
        if(c >= 'a' && c <= 'z'){
            return true;
        }
        else if(c >= 'A' && c <= 'Z'){
            return true;
        }
        else if(c >= '0' && c <= '9') {
            return true;
        }
        else{
            return false;
        }
    }


}
