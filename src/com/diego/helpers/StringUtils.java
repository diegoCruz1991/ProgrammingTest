package com.diego.helpers;

/**
 * Created by dacruz on 1/28/17.
 */
public class StringUtils {

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
