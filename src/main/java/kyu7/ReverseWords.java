package kyu7;

import org.junit.jupiter.api.Test;

public class ReverseWords {

    @Test
    public void test() {
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
        System.out.println(reverseWords("   "));
    }

    public static String reverseWords(final String original) {
        if (original.matches("\\s+")) return original;
        StringBuilder stringBuilder = new StringBuilder();
        String[] s = original.split(" ");
        for (String s1 : s
        ) {
            stringBuilder.append(new StringBuilder(s1).reverse()).append(" ");
        }
        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }
}
