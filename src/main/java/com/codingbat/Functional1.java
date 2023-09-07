/**
 * https://codingbat.com/java/Functional-1
 */
package com.codingbat;

import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {
    /**
     * Variation to {@linkplain Functional1#rightDigit(List)}, new list is generated
     * and returned
     *
     * @param nums a int list of non-negative numbers
     * @return for each number just the rightmost decimal cipher is kept
     */
    public static List<Integer> rightDigitOther(List<Integer> nums) {
        return nums.stream().map(x -> x % 10).collect(Collectors.toList());
    }

    /**
     * codingbat.com/prob/p105967
     *
     * @param strings a list
     * @return no x in any string
     */
    public static List<String> noX(List<String> strings) {
        strings.replaceAll(Functional1::noX);
        return strings;
    }

    /**
     * Helper for {@linkplain Functional1#noX(List)}
     *
     * @param s a string
     * @return no 'x' in it
     */
    private static String noX(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != 'x') {
                result.append(c);
            }
        }
        return result.toString();
    }
}
