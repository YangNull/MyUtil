package com.yangkangjian.util;

/**
 * 字符串工具类
 * Created by scott on 2017/5/31.
 */
public final class StringUtils {
    public static final String EMPTY = "";
    public static final String NULL = null;

    private StringUtils() {
    }

    public static boolean isNullOrEmpty(String string) {
        return string == null || string.trim().isEmpty();
    }

    public static String emptyToNull(String string) {
        return isNullOrEmpty(string) ? null : string;
    }

    public static String nullToEmpty(String string) {
        return (string == null) ? "" : string;
    }

}
