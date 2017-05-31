package com.yangkangjian;

import com.yangkangjian.util.StringUtils;

/**
 * Created by scott on 2017/5/31.
 */

public class Test {
    public static void main(String[] args) {
        System.out.println(StringUtils.isNullOrEmpty("\t"));
        System.out.println(StringUtils.nullToEmpty(null).length());
        System.out.println(StringUtils.emptyToNull(""));
    }

}
