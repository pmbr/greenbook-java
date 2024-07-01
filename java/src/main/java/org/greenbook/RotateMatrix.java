package org.greenbook;

public class RotateMatrix {

    public static void rotate(int[][] matrix) {
        int n =  matrix.length;
        int half_n = n / 2;

        int col;
        int row;

        int count = 0;

        for (row = 0; row < half_n; row++) {
            for (col = row; col < n - row - 1; col++) {
                count = count + 1;
                int e1_col = col;
                int e1_row = row;

                int e2_col = row;
                int e2_row = n - col - 1;

                int e3_col = e2_row;
                int e3_row = n - e2_col - 1;

                int e4_col = e3_row;
                int e4_row = n - e3_col - 1;

                int val_e1 = matrix[e1_row][e1_col];
                int val_e2 = matrix[e2_row][e2_col];
                int val_e3 = matrix[e3_row][e3_col];
                int val_e4 = matrix[e4_row][e4_col];

                matrix[e2_row][e2_col] = val_e1;
                matrix[e3_row][e3_col] = val_e2;
                matrix[e4_row][e4_col] = val_e3;
                matrix[e1_row][e1_col] = val_e4;
            }
        }
    }

}
