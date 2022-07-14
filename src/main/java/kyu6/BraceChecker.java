package kyu6;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Objects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BraceChecker {

    // 6 https://www.codewars.com/kata/5277c8a221e209d3f6000b56/train/java


    @Test
    public void testValid() {
        assertTrue(isValid("()"));
        assertTrue(isValid("[()]"));
        assertTrue(isValid("(({{[[]]}}))"));
        assertTrue(isValid("{}({})[]"));
    }

    @Test
    public void testInvalid() {
        assertFalse(isValid("[(])"));
        assertFalse(isValid("[(]))"));
        assertFalse(isValid("][)("));
        assertFalse(isValid("(})"));
    }

    public static boolean isValid(String braces) {
        var bracketsStack = new LinkedList<Character>();
        for (Character c : braces.toCharArray()) {
            if (c == '(') bracketsStack.add(c);
            if (c == '[') bracketsStack.add(c);
            if (c == '{') bracketsStack.add(c);
            if (c == ')') {
                if (!bracketsStack.isEmpty() && Objects.equals(bracketsStack.peekLast(), '(')) {
                    bracketsStack.removeLast();
                } else return false;
            }
            if (c == ']') {
                if (!bracketsStack.isEmpty() && Objects.equals(bracketsStack.peekLast(), '[')) {
                    bracketsStack.removeLast();
                } else return false;
            }
            if (c == '}') {
                if (!bracketsStack.isEmpty() && Objects.equals(bracketsStack.peekLast(), '{')) {
                    bracketsStack.removeLast();
                } else return false;
            }

        }
        return bracketsStack.isEmpty();
    }
}
