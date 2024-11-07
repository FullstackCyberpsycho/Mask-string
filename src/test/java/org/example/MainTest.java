package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testVowelReplacement() {
        String strEx = Main.vowelReplacement("Hello, world!");

        Assertions.assertEquals(strEx, "H*ll*, w*rld!");
    }
}
