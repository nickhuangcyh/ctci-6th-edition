package org.example.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class c1n6Test {

    @Test
    void stringCompression_inputIsaabcccccaaa_outputIsa2b1c5a3() {
        String result = c1n6.stringCompression("aabcccccaaa");
        assertEquals("a2b1c5a3", result);
    }

    @Test
    void stringCompression_inputIsaabccca_outputIsa2b1c5a3() {
        String result = c1n6.stringCompression("aabccca");
        assertEquals("aabccca", result);
    }
}