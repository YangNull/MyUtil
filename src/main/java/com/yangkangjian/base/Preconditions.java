package com.yangkangjian.base;

/**
 * 前提条件检查
 * Created by scott on 2017/5/31.
 */
public final class Preconditions {
    private Preconditions() {

    }

    /**
     * 检查参数的合法性
     *
     * @param expression
     */
    public static void checkArgument(Boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkArgument(Boolean expression, Object errorMessage) {
        if (!expression) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    public static boolean checkArgumentsNotNull(Object... args) {
        int len = args.length;
        for (int i = 0; i < len; i++) {
            if (args[i] == null) {
                return false;
            }
        }
        return true;
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
