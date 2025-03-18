package reverse_words_in_a_string;

public class ReverseWords {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();
        String[] array = s.split(" ");
        for (int i = array.length - 1; i >= 0; i--){
            if(!array[i].isEmpty()){
                sb.append(array[i] + " ");
            }
        }
        return sb.toString().trim();

    }
}
