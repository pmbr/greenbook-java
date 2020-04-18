package org.greenbook;

import org.junit.Test;

import static org.greenbook.TrigoSpiralMatrix.print;
import static org.junit.Assert.assertEquals;

public class TrigoSpiralMatrixTest {

    @Test
    public void print2x2() {
        int[][] matrix2x2 = {
                {1, 2},
                {3, 4}
        };

        assertEquals("1 2 4 3", print(matrix2x2));
    }

    @Test
    public void print3x3() {
        int[][] matrix3x3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        assertEquals("1 2 3 6 9 8 7 4 5", print(matrix3x3));
    }

    @Test
    public void print4x4() {
        int[][] matrix4x4 = {
                { 1,  2,  3,  4},
                { 5,  6,  7,  8},
                { 9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        assertEquals("1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10", print(matrix4x4));
    }

    @Test
    public void print5x5() {
        int[][] matrix5x5 = {
                {1,   2,  3,  4,  5},
                {6,   7,  8,  9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        assertEquals("1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13", print(matrix5x5));
    }

    @Test
    public void print3x2() {
        int[][] matrix3x2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        assertEquals("1 2 4 6 5 3", print(matrix3x2));
    }

    @Test
    public void print5x3() {
        int[][] matrix5x3 = {
                { 1,  2,  3},
                { 4,  5,  6},
                { 7,  8,  9},
                {10, 11, 12},
                {13, 14, 15}
        };

        assertEquals("1 2 3 6 9 12 15 14 13 10 7 4 5 8 11", print(matrix5x3));
    }

    @Test
    public void print4x7() {
        int[][] matrix4x7 = {
                {1,  2,   3,  4,  5,  6,  7},
                {8,  9,  10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},
                {22, 23, 24, 25, 26, 27, 28}
        };

        assertEquals("1 2 3 4 5 6 7 14 21 28 27 26 25 24 23 22 15 8 9 10 11 12 13 20 19 18 17 16", print(matrix4x7));
    }

}