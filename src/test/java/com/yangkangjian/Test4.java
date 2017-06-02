package com.yangkangjian;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created by scott on 2017/6/2.
 */
public class Test4 {
    public static void main(String[] args) {
        int len = 10;
        int array[] = new int[len];
        initData(array);
        //printlnArray(array);
        //sortArray(array);
        printlnArray(array);
        System.out.println(select(array, 10));

    }

    public static int select(int array[], int num) {
        int start = 0;
        int end = array.length;
        while (start <= end) {
            int min = (start + end) / 2;
            if (array[min] > num) {
                end = min - 1;
            } else if (array[min] < num) {
                start = min + 1;
            } else {
                return min;
            }
        }
        return -1;
    }

    public static void initData(int array[]) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            int num = i + 1;
            array[i] = num;
        }
    }

    public static void sortArray(int array[]) {
        int len = array.length;
        int minValue = 0;
        int minValueIndex = 0;
        for (int i = 0; i < len; i++) {
            minValue = array[i];
            minValueIndex = i;
            for (int j = i; j < len; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minValueIndex = j;
                }
            }
            int temp = array[i];
            array[i] = minValue;
            array[minValueIndex] = temp;
        }
    }

    public static void printlnArray(int array[]) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
}
