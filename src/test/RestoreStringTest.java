import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shuffle_string.RestoreString;
import static org.junit.jupiter.api.Assertions.*;

public class RestoreStringTest {

    private RestoreString restoreString;
    private int[] indices1;
    private String s1;
    private int[] indices2;
    private String s2;

    @BeforeEach
    public void setUp(){

        restoreString = new RestoreString();

        s1 = "codeleet";
        indices1 = new int[]{4, 5, 6, 7, 0, 2, 1, 3};

        s2 = "abc";
        indices2 = new int[]{0, 1, 2};
    }

    @Test
    public void restoreString_checkBasicExample(){
        assertEquals("leetcode", restoreString.restoreString(s1, indices1));
    }

    @Test
    public void restoreString_checkBasicExample2(){
        assertEquals("abc", restoreString.restoreString(s2, indices2));
    }

}
