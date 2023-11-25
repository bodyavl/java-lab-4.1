package org.lab.testing;

import org.junit.jupiter.api.Test;
import org.lab.Main;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTests {
    @Test
    public void testIsPalindrome() {
        assertTrue(Main.isPalindrome(null));
        assertTrue(Main.isPalindrome(""));
        assertTrue(Main.isPalindrome("s"));
        assertTrue(Main.isPalindrome("radar"));
        assertFalse(Main.isPalindrome("banana"));
        assertTrue(Main.isPalindrome("hannah"));
        assertTrue(Main.isPalindrome("pup"));
        assertTrue(Main.isPalindrome("nan"));
        assertFalse(Main.isPalindrome("lollipop"));
        assertTrue(Main.isPalindrome("eye"));
        assertTrue(Main.isPalindrome("6543456"));
        assertTrue(Main.isPalindrome("step on no pets"));
        assertTrue(Main.isPalindrome("A man a plan a canal Panama"));
    }

}
