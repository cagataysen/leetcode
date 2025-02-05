import check_if_one_string_swap_can_make_strings_equal.AreAlmostEqual;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AreAlmostEqualTest {

    private AreAlmostEqual testObject;
    private String testS1;
    private String testS2;
    private String testS3;
    private String testS4;
    private String testS5;
    private String testS6;
    private String testS7;
    private String testS8;



    @BeforeEach
    public void setUp(){
        testObject = new AreAlmostEqual();
        testS1 = "bank";
        testS2 = "kanb";
        testS3 = "attack";
        testS4 = "defend";
        testS5 = "kelb";
        testS6 = "kelb";
        testS7 = "aa";
        testS8 = "ac";
    }


     @Test
    public void checkIfOneSwapMakesItThrough(){
        assertTrue(testObject.areAlmostEqual(testS1, testS2));
     }

    @Test
    public void checkIfImpossibleFalse(){
        assertFalse(testObject.areAlmostEqual(testS3, testS4));
    }

    @Test
    public void checkIfTwoInputsAreEqual(){
        assertTrue(testObject.areAlmostEqual(testS5, testS6));
    }

    @Test
    public void checkEdgeCase1(){
        assertFalse(testObject.areAlmostEqual(testS7, testS8));
    }

}
