package happy_number;


import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {

        Set<Integer> seen = new HashSet<>();

        while(n != 1){
            if(seen.contains(n)){
                return false; // we have seen this number -- cycle
            }
            seen.add(n);

            int sumOfSquares = 0;
            int current = n;

            while(current > 0){
                int digit = current % 10; //get last digit
                sumOfSquares += digit * digit; //add its square
                current /= 10;  // drop the last digit
            }

            n = sumOfSquares;
        }

        //if the loop ends n == 1, its a happy number
        return true;

    }
}
