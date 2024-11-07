package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testVowelReplacement() {
        MaskString maskString = new MaskString();
        String strEx = maskString.vowelReplacement("Hello, world!");

        Assertions.assertEquals(strEx, "H*ll*, w*rld!");
    }
}
