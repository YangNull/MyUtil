package com.yangkangjian;

import java.util.Random;

/**
 * Created by scott on 2017/6/2.
 */
public class Test3 {
    public static void main(String[] args) {
        /**
         * 1 2 3 4
         * 5 6 7 8
         * 9 10 11 12
         */
        int row = 8;
        int column = 8;
        int array[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = 10 + i + j;
            }
        }
        printlnArray(array);
    }

    public static void printlnArray(int array[][]) {
        int row = array.length;
        int column = array[0].length;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.print(array[r][c] + "\t");
            }
            System.out.println();
        }
    }
}
