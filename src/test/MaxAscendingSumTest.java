import maximum_ascending_subarray_sum.MaxAscendingSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxAscendingSumTest {

    private MaxAscendingSum testObject;

    private int[] nums1;
    private int[] nums2;
    private int[] nums3;
    private int[] nums4;
    private int[] nums5;
    private int[] nums6;

    @BeforeEach
    public void setUp(){
        testObject = new MaxAscendingSum();
        nums1 = new int[]{10,20,30,5,10,50};
        nums2 = new int[]{10,20,30,40,50};
        nums3 = new int[]{12,17,15,13,10,11,12};
        nums4 = new int[]{100,10,1};
        nums5 = new int[]{5,5,6,6,6,9,1,2};
        nums6 = new int[]{9,1,3,4};
    }

    @Test
    public void maxAscendingTestCase1(){
        assertEquals(65, testObject.maxAscendingSum(nums1));
    }
    @Test
    public void maxAscendingTestCase2(){
        assertEquals(150, testObject.maxAscendingSum(nums2));
    }
    @Test
    public void maxAscendingTestCase3(){
        assertEquals(33, testObject.maxAscendingSum(nums3));
    }
    @Test
    public void maxAscendingTestCase4EdgeCase(){
        assertEquals(100, testObject.maxAscendingSum(nums4));
    }
    @Test
    public void maxAscendingTestCase5EdgeCase(){
        assertEquals(15, testObject.maxAscendingSum(nums5));
    }
    @Test
    public void maxAscendingTestCase6EdgeCase(){
        assertEquals(9, testObject.maxAscendingSum(nums6));
    }


}
