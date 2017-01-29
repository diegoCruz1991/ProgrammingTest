package com.diego.helpers;

/**
 * Created by dacruz on 1/28/17.
 */
public class PalindromeHelper {

    public static boolean isPalindrome(String word) {
        int length = word.length()/2;
        int secondPointer = word.length() - 1;

        for(int firstPointer = 0; firstPointer < length; firstPointer++) {
            if(word.charAt(firstPointer) != word.charAt(secondPointer)) {
                return false;
            }

            secondPointer--;
        }

        return true;
    }
}
