package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    private MaskString maskString = new MaskString();

    @Test
    void testVowelReplacement() {
        String strEx = maskString.vowelReplacement("Hello, world!");

        Assertions.assertEquals("H*ll*, w*rld!", strEx);
    }

    @Test
    void testSpaceVowelReplacement() {
        String strEx = maskString.vowelReplacement(" ");

        Assertions.assertEquals(" ", strEx);
    }

    @Test
    void testEmptyStringVowelReplacement() {
        String strEx = maskString.vowelReplacement("");

        Assertions.assertEquals("", strEx);
    }

    @Test
    void testNullReplacement() {
        String strEx = maskString.vowelReplacement(null);

        Assertions.assertEquals("",strEx);
    }

    @Test
    void testNumVowelReplacement() {
        String strEx = maskString.vowelReplacement("74570");

        Assertions.assertEquals("74570", strEx);
    }
}
