package org.greenbook;

import static java.lang.Math.PI;
import static java.lang.Math.abs;
import static java.lang.Math.sin;
import static java.lang.Math.cos;

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
