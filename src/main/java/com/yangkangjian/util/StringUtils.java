package com.yangkangjian.util;

/**
 * 字符串工具类
 * Created by scott on 2017/5/31.
 */
public final class StringUtils {
    public static final String SPACE = " ";
    public static final String EMPTY = "";
    public static final String NULL = null;

    private StringUtils() {
    }

    public static boolean isNullOrEmpty(String string) {
        return string == null || string.isEmpty();
    }

    public static String emptyToNull(String string) {
        return isNullOrEmpty(string) ? null : string;
    }

    public static String nullToEmpty(String string) {
        return (string == null) ? "" : string;
    }

    public static boolean isBlank(String string) {
        if (isNullOrEmpty(string)) {
            return true;
        }
        int len = string.length();
        for (int i = 0; i < len; i++) {
            if (Character.isWhitespace(string.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotBlank(String string) {
        return !isBlank(string);
    }
}
