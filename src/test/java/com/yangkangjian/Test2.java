package com.yangkangjian;

import java.util.Random;

/**
 * Created by scott on 2017/6/2.
 */
public class Test2 {
    public static void main(String[] args) {
        int len = 100000;
        float f[] = new float[len];

        for (int i = 0; i < len; i++) {
            f[i] = new Random().nextFloat() * 100f;
//            System.out.println(new Random().nextFloat() * 100.0f);
        }
        for (int i = 0; i < len; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(f[i]);
        }
        System.out.println("\n\n\n\n----------------------------------------\n\n\n\n");
        long startTime = System.currentTimeMillis();
        float n = 0.0f;
        int index = 0;
        for (int i = 0; i < len; i++) {
            n = f[i];
            index = i;
            for (int j = i; j < len; j++) {
                if (f[j] < f[index]) {
                    n = f[j];
                    index = j;
                }
            }
            float temp = f[i];
            f[i] = f[index];
            f[index] = temp;
        }
        System.out.println(System.currentTimeMillis() - startTime);
        for (int i = 0; i < len; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(f[i]+"\t");
        }
    }
}
