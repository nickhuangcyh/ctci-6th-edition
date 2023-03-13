package org.example.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class c1n8Test {

    @Test
    void setMatrixZeros() {
        int [][] matrix = {
                {1, 0, 3, 4},
                {5, 2, 7, 8},
                {9, 1, 2, 3},
                {4, 5, 6, 0}
        };
        int [][] setZerosMatrix = c1n8.setMatrixZeros(matrix);

        int [][] expectedResult = {
                {0, 0, 0, 0},
                {5, 0, 7, 0},
                {9, 0, 2, 0},
                {0, 0, 0, 0}
        };
        assertArrayEquals(expectedResult, setZerosMatrix);
    }
}