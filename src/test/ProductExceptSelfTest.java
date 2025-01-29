import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import product_of_array_except_self.ProductExceptSelf;
import static org.junit.jupiter.api.Assertions.*;

public class ProductExceptSelfTest {

    private ProductExceptSelf testObject;

    @BeforeEach
    public void setUp(){
        testObject = new ProductExceptSelf();
    }

    @Test
    public void calculationOfSomeArrays(){
        int[] exampleInput1 = {-1, 1, 0, -3, 3};
        int[] expected1 = {0,0,9,0,0};

        int[] exampleInput2 = {1, 2, 3, 4};
        int[] expected2 = {24,12,8,6};

        assertArrayEquals(expected1, testObject.productExceptSelf(exampleInput1));
        assertArrayEquals(expected2, testObject.productExceptSelf(exampleInput2));
    }
}
