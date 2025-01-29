import most_common_word.MostCommonWord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MostCommonWordTest {

    private MostCommonWord testObject;

    @BeforeEach
    public void setUp(){
        testObject = new MostCommonWord();
    }

    @Test
    public void normalSentecesTest(){
        assertEquals("ball", testObject.mostCommonWord("Bob hit a ball, the hit BALL" +
                        " flew far after it was hit.", new String[]{"hit"} ));
    }

    @Test
    public void regexTrendWordTest(){
        assertEquals("a", testObject.mostCommonWord("a.", new String[]{}));
    }

}
