package org.example.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class c1n2Test {

    @Test
    void isPermutation_inputIsabcdeAndcbdae_outputIsTrue() {
        boolean isPermutation = c1n2.isPermutation("abcde", "cbdae");
        assertTrue(isPermutation);
    }

    @Test
    void isPermutation_inputIsabcdefAndcbdaef_outputIsFalse() {
        boolean isPermutation = c1n2.isPermutation("abcdef", "cbdaefg");
        assertFalse(isPermutation);
    }

    @Test
    void isPermutation_inputIsabcdefgAndcbdaef_outputIsFalse() {
        boolean isPermutation = c1n2.isPermutation("abcdefg", "cbdaef");
        assertFalse(isPermutation);
    }

    @Test
    void isPermutation_inputIsabdefAndcbdae_outputIsFalse() {
        boolean isPermutation = c1n2.isPermutation("abdef", "cbdae");
        assertFalse(isPermutation);
    }

    @Test
    void isPermutation2_inputIsabcdeAndcbdae_outputIsTrue() {
        boolean isPermutation = c1n2.isPermutation2("abcde", "cbdae");
        assertTrue(isPermutation);
    }

    @Test
    void isPermutation2_inputIsabcdefAndcbdaef_outputIsFalse() {
        boolean isPermutation = c1n2.isPermutation2("abcdef", "cbdaefg");
        assertFalse(isPermutation);
    }

    @Test
    void isPermutation2_inputIsabcdefgAndcbdaef_outputIsFalse() {
        boolean isPermutation = c1n2.isPermutation2("abcdefg", "cbdaef");
        assertFalse(isPermutation);
    }

    @Test
    void isPermutation2_inputIsabdefAndcbdae_outputIsFalse() {
        boolean isPermutation = c1n2.isPermutation2("abdef", "cbdae");
        assertFalse(isPermutation);
    }
}