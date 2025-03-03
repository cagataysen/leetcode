package shuffle_string;

import java.util.HashMap;
import java.util.Map;

public class RestoreString {
    public String restoreString(String s, int[] indices) {
        Map<Integer, Character> inputMap = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < indices.length; i++){
            inputMap.put(indices[i]++, s.charAt(i));
        }

        for(int i = 0; i < s.length(); i++){
            result.append(inputMap.get(i));
        }

        return result.toString();
    }

}
