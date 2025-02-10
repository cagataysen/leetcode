package clear_digits;

public class ClearDigits {
    public String clearDigits(String s) {

        StringBuilder result = new StringBuilder();

        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                if(!result.isEmpty()){
                    result.deleteCharAt(result.length() - 1);
                }
            }
            else{
                result.append(c);
            }
        }

        return result.toString();


    }
}
