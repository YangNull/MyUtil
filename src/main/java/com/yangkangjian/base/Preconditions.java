package com.yangkangjian.base;

/**
 * 前提条件
 * Created by scott on 2017/5/31.
 */
public final class Preconditions {
    private Preconditions() {

    }

    public static <T> T checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }

    public static <T> T checkNotNull(T reference, Object errorMessage) {
        if (reference == null) {
            throw new NullPointerException(String.valueOf(errorMessage));
        }
        return reference;
    }
}
