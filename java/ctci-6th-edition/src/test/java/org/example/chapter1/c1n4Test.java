package org.example.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class c1n4Test {

    @Test
    void isPalindromePermutation_inputIsTactCoa_outputIsTrue() {
        boolean result = c1n4.isPalindromePermutation("Tact Coa");
        assertTrue(result);
    }

    @Test
    void isPalindromePermutation_inputIsTactCoay_outputIsFalse() {
        boolean result = c1n4.isPalindromePermutation("Tact Coa y");
        assertFalse(result);
    }
}