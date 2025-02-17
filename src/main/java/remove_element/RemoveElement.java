package remove_element;

public class RemoveElement {
    public int removeElement2(int[] nums, int val) {
        int index = 0;  //pointer for placing the next valid element
        for(int num: nums){
            if(num != val){
                nums[index] = num;
                index++;
            }
        }
        return index;
    }



    public int removeElement(int[] nums, int val) {
        int y = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            while(y>=0 && nums[y] == val){
                y--;
            }
            if(i >= y){
                break;
            }

            if(nums[i] == val){
                nums[i] = nums[y];
                nums[y] = val;
                y--;
            }
        }
        return y+1;
    }
}
