package next_greater_element;

import java.util.HashMap;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    //brute force :(
        int[] result = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            int element = nums1[i];
            int index = -1;
            for(int j = 0; j < nums2.length; j++){
                if(nums2[j] == element){
                    index = j;
                    break;
                }
            }
            result[i] = -1;
            for (int k = index + 1; k < nums2.length; k++){
                if (nums2[k] > element){
                    result[i] = nums2[k];
                    break;
                }
            }
        }
        return result;

    }
}
