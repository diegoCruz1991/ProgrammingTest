package com.diego.helpers;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by dacruz on 1/28/17.
 */
public class ConsecutiveHelper {

    public static String getGreatestConsecutiveNumber(int number, String word) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int pointer = 0; pointer < word.length(); pointer++) {
            generateConsecutiveNumbers(number, word.substring(pointer, word.length()), treeSet);
        }

        return treeSet.last().toString();
    }

    private static void generateConsecutiveNumbers(int number, String word, Set<Integer> treeSet) {
        int secondIndex = word.length();
        int firstIndex = 0;
        int limit = word.length();

        for(int index = 0; index < limit; index++) {
            String tempString = word.substring(firstIndex, secondIndex);

            if(Integer.parseInt(tempString) % number == 0) {
                treeSet.add(Integer.parseInt(tempString));
            }

            secondIndex--;
        }
    }
}
