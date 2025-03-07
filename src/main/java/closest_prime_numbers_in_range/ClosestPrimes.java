package closest_prime_numbers_in_range;

import java.util.ArrayList;
import java.util.List;

public class ClosestPrimes {
    public int[] closestPrimes(int left, int right) {
        List<Integer> primes = new ArrayList<>();

        //finding all primes in range
        for(int i = left; i <= right; i++){
            if (isPrimeNumber(i)){
                primes.add(i);
            }
        }

        if(primes.size() < 2){
            return new int[]{-1, -1};
        }

        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        //finding closest pair
        for (int i = 0; i < primes.size() - 1; i++){    //not to overflow -1 due to comparison
            int diff = primes.get(i+1) - primes.get(i);
            if(diff < minDiff){
                minDiff = diff;
                result[0] = primes.get(i);
                result[1] = primes.get(i+1);
            }
        }
        return result;

    }

    public boolean isPrimeNumber(int number){
        if(number <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

}
