package com.diego;

import com.diego.helpers.ConsecutiveHelper;
import com.diego.helpers.PalindromeHelper;
import com.diego.helpers.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class AppChallenge {

    public static void main(String[] args) {
        List<String> result = AppChallenge.getPalindromesAndConsecutiveMultiples(2, "ANNA BAKES 80 CAKES IN THE NOON, 989216011");

        result.forEach(word -> System.out.print(word + " "));
    }

    public static List<String> getPalindromesAndConsecutiveMultiples(int number, String string) {
        List<String> result = new ArrayList<>();

        if(!string.isEmpty()) {
            String[] words = string.split(" ");

            for (int index = 0; index < words.length; index++) {
                String tempWord = words[index].replace(',', '\u0000');

                if (!tempWord.isEmpty()) {
                    if (StringUtils.isNumeric(tempWord)) {
                        result.add(ConsecutiveHelper.getGreatestConsecutiveNumber(number, tempWord).toUpperCase());
                    } else {
                        if (PalindromeHelper.isPalindrome(tempWord.trim())) {
                            result.add(tempWord.toUpperCase());
                        }
                    }
                }
            }
        }

        return result;
    }
}
