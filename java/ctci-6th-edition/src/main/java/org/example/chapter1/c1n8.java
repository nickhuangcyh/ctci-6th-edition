package org.example.chapter1;

import java.util.HashSet;
import java.util.Set;

/*
1.8 Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.

#17.
If you just cleared the rows and columns as you found Os, you'd likely wind up clearing the whole matrix.
Try finding the cells with zeros first before making any changes to the matrix.

#74.
Can you use O(N) additional space instead of O(N2)? What information do you really need from the list of cells that are zero?

#102.
You probably need some data storage to maintain a list of the rows and columns that need to be zeroed.
Can you reduce the additional space usage to 0(1) by using the matrix itself for data storage?

 */
public class c1n8 {

    /*
    time complexity :   O(n)
    space complexity :  O(n)
     */
    static int [][] setMatrixZeros(int [][] matrix) {
        Set<Integer> zerosRows = new HashSet<>();
        Set<Integer>  zerosColumns = new HashSet<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 0) {
                    zerosRows.add(row);
                    zerosColumns.add(column);
                }
            }
        }

        return setMatrixZerosWithRowsAndColumns(matrix, zerosRows, zerosColumns);
    }

    static int [][] setMatrixZerosWithRowsAndColumns(int [][] matrix, Set<Integer> rows, Set<Integer> columns) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (rows.contains(row) || columns.contains(column)) {
                    matrix[row][column] = 0;
                }
            }
        }
        return matrix;
    }
}
