package org.greenbook;

import static java.lang.Math.PI;
import static java.lang.Math.abs;
import static java.lang.Math.sin;
import static java.lang.Math.cos;

/**
 * Given an input N x M matrix int[][], prints its elements in spiral, starting from position [0][0].
 * --
 * Implementation uses trigonometric functions to control iteration over elements.
 * --------------------------------------------------------
 * Example 1:
 * Matrix 2 x 2
 * Input:
 * | 1  2 |
 * | 3  4 |
 * Output:
 * 1 2 4 3
 * --------------------------------------------------------
 * Example 2:
 * Matrix 5 x 3
 * --
 * Input:
 * |  1    2     3 |
 * |  4    5     6 |
 * |  7    8     9 |
 * | 10   11    12 |
 * | 13   14    15 |
 * --
 * Output:
 * 1 2 3 6 9 12 15 14 13 10 7 4 5 8 11
 */
public class TrigoSpiralMatrix {

    public static String print(int[][] matrix) {
        int size = matrix.length * matrix[0].length;
        int read = 0;

        int angleInDegrees = 0;

        int hSteps = matrix[0].length - 1;
        int vSteps = matrix.length - 1;

        int steps;

        int row = 0;
        int col = -1;

        String output = "";

        while (read < size) {

            int moveRow = sinOfAngleInDegrees(angleInDegrees);
            int moveCol = cosOfAngleInDegrees(angleInDegrees);

            steps = (hSteps * abs(moveCol)) + (vSteps * abs(moveRow));

            for (int i = 0; i <= steps; i++) {
                row = row + moveRow;
                col = col + moveCol;
                output = output + matrix[row][col] + " ";
                read++;
            }

            vSteps = vSteps - abs(cosOfAngleInDegrees(angleInDegrees));
            hSteps = hSteps - abs(sinOfAngleInDegrees(angleInDegrees));

            angleInDegrees = angleInDegrees + 90;

        }

        return output.trim();
    }

    private static double angleInDegreesToAngleInRadians(int angleInDegrees) {
        return PI * (angleInDegrees / 180.0);
    }

    private static int sinOfAngleInDegrees(int angleInDegrees) {
        return (int) sin(angleInDegreesToAngleInRadians(angleInDegrees));
    }

    private static int cosOfAngleInDegrees(int angleInDegrees) {
        return (int) cos(angleInDegreesToAngleInRadians(angleInDegrees));
    }

}
