package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * The function BalancedBrackets should return true if and only if
 * the input string has a set of "balanced" brackets.
 *
 * That is, whether it consists entirely of pairs of opening/closing
 * brackets (in that order), none of which mis-nest. We consider a bracket
 * to be square-brackets: [ or ].
 *
 * The string may contain non-bracket characters as well.
 *
 * These strings have balanced brackets:
 *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
 *
 * While these do not:
 *   "[LaunchCode", "Launch]Code[", "[", "]["
 *
 * @param str - to be validated
 * @return true if balanced, false otherwise
 */
public class BalancedBracketsTest {
    BalancedBrackets test_Class;
    @Before
    public void createTestClass() {
        test_Class = new BalancedBrackets();
    }
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }
    @Test
    public void bracketsWithTextReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[Hello World!]"));
    }
    @Test
    public void bracketsIsolatingTextReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("Hello [World!]"));
    }
    @Test
    public void onlyNestedBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets(""));
    }
    @Test
    public void twoSetsOfBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[][]"));
    }
    @Test
    public void onlyBracketsInWrongOrderFalse() {
        assertFalse(test_Class.hasBalancedBrackets("]["));
    }
    @Test
    public void bracketsInWrongOrderWithTextFalse() {
        assertFalse(test_Class.hasBalancedBrackets("Hello ]World!["));
    }
    @Test
    public void missingABracketReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("[Hello World!"));
    }
    @Test
    public void onlyABracketReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("["));
    }
}
