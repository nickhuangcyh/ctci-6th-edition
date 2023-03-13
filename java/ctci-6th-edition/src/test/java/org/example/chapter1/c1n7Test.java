package org.example.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class c1n7Test {

    @Test
    void rotateMatrix90() {
        int [][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 1, 2, 3},
                {4, 5, 6, 7}
        };
        int [][] expectedResult = {
                {4, 9, 5, 1},
                {5, 1, 6, 2},
                {6, 2, 7, 3},
                {7, 3, 8, 4}
        };
        int [][] rotatedMatrix = c1n7.rotateMatrix90(matrix);
        c1n7.printMatrix(rotatedMatrix);

        assertArrayEquals(expectedResult, rotatedMatrix);
    }
}