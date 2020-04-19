package org.greenbook;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.greenbook.RotateMatrix.rotate;

public class RotateMatrixTest {

    @Test
    public void rotate4x4() {
        int[][] matrix = new int[][] {
            { 1,  2,  3,  4} ,
            { 5,  6,  7,  8} ,
            { 9, 10, 11, 12} ,
            {13, 14, 15, 16} ,
        };
        rotate(matrix);
        int[][] expected = new int[][] {
            {4, 8, 12, 16} ,
            {3, 7, 11, 15} ,
            {2, 6, 10, 14} ,
            {1, 5, 9, 13} ,
        };
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void rotate5x5() {
        int[][] matrix = new int[][] {
            { 1,  2,  3,  4, 5} ,
            { 6,  7,  8,  9, 10} ,
            {11, 12, 13, 14, 15} ,
            {16, 17, 18, 19, 20} ,
            {21, 22, 23, 24, 25} ,
        };
        rotate(matrix);
        int[][] expected = new int[][] {
            {5, 10, 15, 20, 25} ,
            {4, 9,  14, 19, 24} ,
            {3, 8,  13, 18, 23} ,
            {2, 7,  12, 17, 22} ,
            {1, 6,  11, 16, 21} ,
        };
        assertArrayEquals(expected, matrix);
    }

}