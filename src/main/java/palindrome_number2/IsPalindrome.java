package palindrome_number2;

public class IsPalindrome {

    //StringBuilder --> mutable, so when you call sb.reverse(), sb changes
    //equals is not overrided in StringBuilder class and it compares the references
    //thats why we call toString() methods for each side.
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        StringBuilder sb = new StringBuilder(String.valueOf(x));
        return sb.toString().equals(sb.reverse().toString());

    }

    public boolean isPalindrome2(int x) {
        String s = String.valueOf(x);
        int n = s.length();

        for (int i = 0; i < n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
