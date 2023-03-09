package org.example.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class c1n5Test {

    @Test
    void isInsertOrRemoveOrReplaceOrNothingWay_inputsArepaleAndple_outputIsTrue() {
        boolean result = c1n5.isInsertOrRemoveOrReplaceOrNothingWay("pale", "ple");
        assertTrue(result);
    }

    @Test
    void isInsertOrRemoveOrReplaceOrNothingWay_inputsArepalesAndpales_outputIsTrue() {
        boolean result = c1n5.isInsertOrRemoveOrReplaceOrNothingWay("pales", "pale");
        assertTrue(result);
    }

    @Test
    void isInsertOrRemoveOrReplaceOrNothingWay_inputsArepaleAndbale_outputIsTrue() {
        boolean result = c1n5.isInsertOrRemoveOrReplaceOrNothingWay("pale", "bale");
        assertTrue(result);
    }

    @Test
    void isInsertOrRemoveOrReplaceOrNothingWay_inputsArepaleAndbake_outputIsFalse() {
        boolean result = c1n5.isInsertOrRemoveOrReplaceOrNothingWay("pale", "bake");
        assertFalse(result);
    }

    @Test
    void isInsertOrRemoveOrReplaceOrNothingWayInSinglePass_inputsArepaleAndple_outputIsTrue() {
        boolean result = c1n5.isInsertOrRemoveOrReplaceOrNothingWayInSinglePass("pale", "ple");
        assertTrue(result);
    }

    @Test
    void isInsertOrRemoveOrReplaceOrNothingWayInSinglePass_inputsArepalesAndpales_outputIsTrue() {
        boolean result = c1n5.isInsertOrRemoveOrReplaceOrNothingWayInSinglePass("pales", "pale");
        assertTrue(result);
    }

    @Test
    void isInsertOrRemoveOrReplaceOrNothingWayInSinglePass_inputsArepaleAndbale_outputIsTrue() {
        boolean result = c1n5.isInsertOrRemoveOrReplaceOrNothingWayInSinglePass("pale", "bale");
        assertTrue(result);
    }

    @Test
    void isInsertOrRemoveOrReplaceOrNothingWayInSinglePass_inputsArepaleAndbake_outputIsFalse() {
        boolean result = c1n5.isInsertOrRemoveOrReplaceOrNothingWayInSinglePass("pale", "bake");
        assertFalse(result);
    }
}