import org.junit.Test;
import java.util.Deque;

import static org.junit.Assert.*;
public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }

    @Test
    public void testIsPalindromeApplyDeque(){
        /*  null
         *  expected: false
         */
        Deque d = palindrome.wordToDeque(null);
        assertFalse(palindrome.isPalindromeApplyDeque(d));

        /* len: 0/1
         * expected: true
         */
        d = palindrome.wordToDeque("s");
        assertTrue( palindrome.isPalindromeApplyDeque(d));
        d = palindrome.wordToDeque("");
        assertTrue(palindrome.isPalindromeApplyDeque(d));
        d = palindrome.wordToDeque("shjhs");
        assertTrue( palindrome.isPalindromeApplyDeque(d));
        d = palindrome.wordToDeque("sdfes");
        palindrome.isPalindromeApplyDeque(d);
        assertFalse( palindrome.isPalindromeApplyDeque(d));

    }

    @Test
    public void testIsPalindrome(){
        /*  null
         *  expected: false
         */
        assertFalse(palindrome.isPalindrome(null));

        /* len: 0/1
         * expected: true
         */
        assertTrue( palindrome.isPalindrome("s"));
        assertTrue(palindrome.isPalindrome(""));
        assertTrue( palindrome.isPalindrome("shjhs"));
        assertTrue( palindrome.isPalindrome("essshjhssse"));
        assertFalse( palindrome.isPalindrome("sdfes"));
        assertFalse( palindrome.isPalindrome("esdfes"));

    }

    @Test
    public void testOffByOne(){
        OffByOne offByOne = new OffByOne();
        assertTrue(offByOne.equalChars('a','b'));
        assertTrue(offByOne.equalChars('r','q'));
        assertFalse(offByOne.equalChars('r','r'));
        assertFalse(offByOne.equalChars('r','a'));
        assertFalse(offByOne.equalChars('r','z'));

    }

    @Test
    public void testOverloadedIsPalindromeOBO(){
        OffByOne offByOne = new OffByOne();
        palindrome.isPalindrome("word", offByOne);
        palindrome.isPalindrome("flake", offByOne);
        assertTrue(palindrome.isPalindrome("flake", offByOne));
    }

    @Test
    public void testOverloadedIsPalindromeOBN(){
        OffByN offByN = new OffByN(5);
        assertFalse(palindrome.isPalindrome("word", offByN));
        assertTrue(palindrome.isPalindrome("aaff", offByN));

        offByN = new OffByN(1);
        assertTrue(offByN.equalChars('a','b'));
        assertTrue(offByN.equalChars('r','q'));
        assertFalse(offByN.equalChars('r','r'));
        assertFalse(offByN.equalChars('r','a'));
        assertFalse(offByN.equalChars('r','z'));

    }

}