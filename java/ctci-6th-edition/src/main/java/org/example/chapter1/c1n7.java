package org.example.chapter1;

/*
1.7 Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method
 to rotate the image by 90 degrees. Can you do this in place?

# 51.
Try thinking about it layer by layer. Can you rotate a specific layer?

# 100.
Rotating a specific layer would just mean swapping the values in four arrays. If you were asked to swap the values in
 two arrays, could you do this? Can you then extend it to four arrays?

 */

public class c1n7 {
    static int [][] rotateMatrix90(int [][] matrix) {
        /**
         *  [Question]
         *  -------------
         *  {1, 2, 3, 4},
         *  {5, 6, 7, 8},
         *  {9, 1, 2, 3},
         *  {4, 5, 6, 7}
         *  to
         *  {4, 9, 5, 1},
         *  {5, 1, 6, 2},
         *  {6, 2, 7, 3},
         *  {7, 3, 8, 4}
         *  -------------
         *  [Solution]
         *  -------------
         *  {1, 2, 3, 4},
         *  {5, 6, 7, 8},
         *  {9, 1, 2, 3},
         *  {4, 5, 6, 7}
         *  to
         *  {1, 5, 9, 4},
         *  {2, 6, 1, 5},
         *  {3, 7, 2, 6},
         *  {4, 8, 3, 7}
         *  to
         *  {4, 9, 5, 1},
         *  {5, 1, 6, 2},
         *  {6, 2, 7, 3},
         *  {7, 3, 8, 4}
         *  -------------
         */

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0, k = matrix[i].length - 1; j < matrix[i].length / 2; j++, k--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }
        return matrix;
    }

    static void printMatrix(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
