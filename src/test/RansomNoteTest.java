import org.junit.jupiter.api.Test;
import ransom_note.RansomNote;
import static org.junit.jupiter.api.Assertions.*;

public class RansomNoteTest {
    @Test
    void testCanConstruct(){
        RansomNote ransomNote = new RansomNote();

        assertTrue(ransomNote.canConstruct("a", "aa"));;
        assertFalse(ransomNote.canConstruct("aa", "a"));

        assertTrue(ransomNote.canConstruct("", "abc"));
        assertFalse(ransomNote.canConstruct("a", ""));

        assertTrue(ransomNote.canConstruct("abc", "aabbcc"));
        assertFalse(ransomNote.canConstruct("abcd", "aabbcc"));

    }
}
