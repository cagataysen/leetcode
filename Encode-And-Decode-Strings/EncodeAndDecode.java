import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecode {
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for (String str : strs) {

            encodedString.append(str.length()).append(':').append(str);
        }

        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedString = new ArrayList<>();
        int index = 0;

        while (index < str.length()) {
            int delimiterPos = str.indexOf(':', index);

            int size = Integer.parseInt(str.substring(index, delimiterPos));

            index = delimiterPos + 1;

            decodedString.add(str.substring(index, index + size));

            index += size;
        }

        return decodedString;
    }
}
