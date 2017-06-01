package com.yangkangjian;

import com.google.common.io.ByteStreams;
import com.sun.istack.internal.NotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by scott on 2017/5/31.
 */

public class Test {
    public static void main(String[] args) {
        String sourcePath = "D:" + File.separator + "JavaDoc.zip";
        String targerPath = "D:" + File.separator + "copy" + File.separator + "JavaDoc.zip";
        System.out.println(sourcePath + "-->" + targerPath);
        try {
            Long startTime = System.currentTimeMillis();
            Long result = ByteStreams.copy(new FileInputStream(new File(sourcePath)), new FileOutputStream(new File(targerPath)));
            System.out.println(result);
            Long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void test(@NotNull String test) {
        System.out.println(test);
    }

}
