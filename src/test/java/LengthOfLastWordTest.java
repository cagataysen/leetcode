import length_of_last_word.LengthOfLastWord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LengthOfLastWordTest {

    private LengthOfLastWord objectTest;

    @BeforeEach
    public void setUp(){
        objectTest = new LengthOfLastWord();
    }

    @Test
    public void sentencesTest(){
        assertEquals(5, objectTest.lengthOfLastWord("Hello World"));
        assertEquals(6, objectTest.lengthOfLastWord("luffy is still joyboy"));
    }

    @Test
    public void sentenceWithGapsTest(){
        assertEquals(5, objectTest.lengthOfLastWord("   Hello World     "));
        assertEquals(6, objectTest.lengthOfLastWord("      luffy is still joyboy     "));
    }

    @Test
    public void emptyStringTest(){
        assertEquals(0, objectTest.lengthOfLastWord(""));
        assertEquals(0, objectTest.lengthOfLastWord("   "));
    }

    @Test
    public void oneWordTest(){
        assertEquals(4, objectTest.lengthOfLastWord("word"));
    }





}
