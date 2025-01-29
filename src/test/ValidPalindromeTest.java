import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import valid_palindrome.ValidPalindrome;
import valid_palindrome_two_pointers.ValidPalindromeTwoPointersSolution;

import static org.junit.jupiter.api.Assertions.*;

public class ValidPalindromeTest {

    private ValidPalindromeTwoPointersSolution testObject1;
    private ValidPalindrome testObject2;


    @BeforeEach
    public void setUp(){
        testObject1 = new ValidPalindromeTwoPointersSolution();
        testObject2 = new ValidPalindrome();
    }

    @Test
    public void notPalindromeTest(){
        assertFalse(testObject1.isPalindrome("race a car"));
        assertFalse(testObject2.isPalindrome("race a car"));
    }

    @Test
    public void palindromeTest(){
        assertTrue(testObject1.isPalindrome("ey edip adanada pide ye"));
        assertTrue(testObject2.isPalindrome("ey edip adanada pide ye"));
    }

    @Test
    public void palindromeWithSpecialCharacterTest(){
        assertTrue(testObject1.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(testObject2.isPalindrome("A man, a plan, a canal: Panama"));
    }


    @Test
    public void emptyStringShouldBeTrueTest(){
        assertTrue(testObject1.isPalindrome(" "));
        assertTrue(testObject2.isPalindrome(" "));
    }


}
