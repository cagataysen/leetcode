package roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue= 0;

        for(int i = 0; i < s.length(); i++){
            int currentValue = romanMap.get(s.charAt(i));

            if(currentValue > prevValue){
                total += currentValue - 2 * prevValue;  //we added the prevValue already so double
            }
            else{
                total += currentValue;
            }

            prevValue = currentValue;

        }

        return total;


    }
}
