package length_of_last_word;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        if(s == null || s.trim().isEmpty()){
            return 0;
        }

        String[] strArray = s.split(" ");
        return strArray[strArray.length - 1].length();

    }
}
