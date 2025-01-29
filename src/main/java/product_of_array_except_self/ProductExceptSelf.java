package product_of_array_except_self;

import java.util.ArrayList;
import java.util.List;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        // nums [1, 2, 3, 4] - multiply each nums[i] left side
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        // left answer [1, 1, 2, 6]


        // nums [1, 2, 3, 4] - multiply each nums[i] right side

        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        // right answer [24, 12, 4, 1]
        //suffixProduct *= nums[i]; this line multiplies left and right hand answers.

        return answer;
    }
}
