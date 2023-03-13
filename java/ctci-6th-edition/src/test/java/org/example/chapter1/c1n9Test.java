package org.example.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class c1n9Test {

    @Test
    void isARotationSubstring_inputIswaterbottleAnderbottlewat_outputIsTrue() {
        boolean isARotationSubstring = c1n9.isARotationSubstring("waterbottle", "erbottlewat");
        assertTrue(isARotationSubstring);
    }

    @Test
    void isARotationSubstring_inputIswatersbottleAnderbottlewat_outputIsFalse() {
        boolean isARotationSubstring = c1n9.isARotationSubstring("watersbottle", "erbottlewat");
        assertFalse(isARotationSubstring);
    }
}