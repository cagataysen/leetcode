package reverse_string_2;

public class ReverseString {
    public void reverseString(char[] s) {
        int right = s.length - 1;
        for(int i = 0; i < s.length; i++){
            if(i >= right){
                break;
            }
            char temp = s[i];
            s[i] = s[right];
            s[right] = temp;
            right--;
        }
    }
}
