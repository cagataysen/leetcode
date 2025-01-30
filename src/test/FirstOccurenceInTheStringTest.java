import find_the_index_of_the_first_occurence_in_a_string.FirstOccurenceInTheString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FirstOccurenceInTheStringTest {
    private FirstOccurenceInTheString testObject;

    @BeforeEach
    public void setUp(){
        testObject = new FirstOccurenceInTheString();
    }

    @Test
    public void checkFirstOccurence(){
        assertEquals(0, testObject.strStr("sadbutsad", "sad"));
    }

    @Test
    public void checkIfNotExist(){
        assertEquals(-1, testObject.strStr("leetcode", "leeto"));
    }


}
