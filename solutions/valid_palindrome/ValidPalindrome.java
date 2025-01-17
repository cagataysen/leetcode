public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        String input = s.replace("[^a-zA-Z0-9]", "").toLowerCase();

        StringBuilder reverseBuilder = new StringBuilder(input);
        String reversedString = reverseBuilder.reverse().toString();

        return reversedString.equals(input);

    }
}
