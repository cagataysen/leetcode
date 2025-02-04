import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import word_pattern.WordPattern;
import static org.junit.jupiter.api.Assertions.*;

public class WordPatternTest {

    private WordPattern testObject;

    private String pattern1;
    private String s1;
    private String pattern2;
    private String s2;
    private String pattern3;
    private String s3;
    private String pattern4;
    private String s4;



    @BeforeEach
    public void setUp(){
        testObject = new WordPattern();

        pattern1 = "abba";
        s1 = "dog cat cat dog";

        pattern2 = "abba";
        s2 = "dog cat cat fish";

        pattern3 = "aaaa";
        s3 = "dog cat cat dog";

        pattern4 = "aba";
        s4 = "cat cat cat dog";

    }

    @Test
    public void testWordPattern1(){
        assertTrue(testObject.wordPattern(pattern1, s1));
    }

    @Test
    public void testWordPattern2(){
        assertFalse(testObject.wordPattern(pattern2, s2));
    }

    @Test
    public void testWordPattern3(){
        assertFalse(testObject.wordPattern(pattern3, s3));
    }


    @Test
    public void testWordPattern4(){
        assertFalse(testObject.wordPattern(pattern4, s4));
    }


}
