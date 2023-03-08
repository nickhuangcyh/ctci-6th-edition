package org.example.chapter1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class c1n1Test {

    @Test
    void isUniqueChars_inputIsabcdefghijklmnopqrstuvwxyz_outputIsTrue() {
        boolean isUniqueChars = c1n1.isUniqueChars("abcdefghijklmnopqrstuvwxyz");
        assertTrue(isUniqueChars);
    }

    @Test
    void isUniqueChars_inputIsabcdeef_outputIsFalse() {
        boolean isUniqueChars = c1n1.isUniqueChars("abcdeef");
        assertFalse(isUniqueChars);
    }
}