package org.example.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class c1n3Test {

    @Test
    void urlify_test1() {
        char[] urlifyCharArray = c1n3.urlify("Mr John Smith ".toCharArray(), 13);
        assertArrayEquals(urlifyCharArray, "Mr%20John%20Smith".toCharArray());
    }

    @Test
    void urlify_test2() {
        char[] urlifyCharArray = c1n3.urlify("Mr Nick Huang is a man who live in Taipei".toCharArray(), 23);
        assertArrayEquals(urlifyCharArray, "Mr%20Nick%20Huang%20is%20a%20man%20".toCharArray());
    }
}