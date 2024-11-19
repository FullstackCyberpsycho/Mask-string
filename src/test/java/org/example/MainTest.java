package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

    private MaskString maskString;

    @BeforeEach
    void setUp() {
        maskString = new MaskString();
    }

    @Test
    void testVowelReplacement() {
        String strEx = maskString.vowelReplacement("Hello, world!");

        Assertions.assertEquals("H*ll*, w*rld!", strEx);
    }

    @Test
    void testNullVowelReplacement() {
        String strEx = maskString.vowelReplacement(" ");

        Assertions.assertEquals( " ", strEx);
    }

    @Test
    void testNumVowelReplacement() {
        String strEx = maskString.vowelReplacement("74570");

       Assertions.assertEquals("74570", strEx);
    }
}
