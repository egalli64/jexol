/*
  CodingBat Java Recursion 1 - https://codingbat.com/java/Recursion-1

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.recursion1;

/**
 * countAbc - https://codingbat.com/prob/p161124
 * <p>
 * Count recursively "abc" and "aba" occurrences in the passed string
 */
public class CountAbc {
    /**
     * Base case: a string shorter than 3 has no target in it
     * <p>
     * Recursive part: check if the current element has a target in it, return what
     * the recursion on the string stripped of the first char returns, added by 1
     * when required.
     *
     * @param str a string
     * @return number of sub "abc" and "aba"
     */
    public static int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }

        int count = isGood(str) ? 1 : 0;
        return count + countAbc(str.substring(1));
    }

    /**
     * Helper for {@linkplain CountAbc#countAbc(String)}
     *
     * @param s a string
     * @param i a position
     * @return true if s from i is "abc" or "aba"
     */
    static boolean isGood(String s) {
        char last = s.charAt(2);
        return s.charAt(0) == 'a' && s.charAt(1) == 'b' && (last == 'a' || last == 'c');
    }

    /**
     * Inception for {@linkplain CountAbc#tailRec(String, int i, int acc)},
     * following the tail recursive approach
     *
     * @param str a string
     * @return number of sub "abc" and "aba"
     */
    public static int tailRec(String str) {
        return tailRec(str, 0, 0);
    }

    /**
     * Tail recursion for {@linkplain CountAbc#tailRec(String)}
     * <p>
     * Base case: if the index is too much on the right, no more target could be
     * found, return the accumulator.
     * <p>
     * Recursive part: check if the current index refers to a target, recurse
     * increasing the index and, when required, the accumulator.
     *
     * @param s   a string
     * @param i   current position
     * @param acc current sum of found substrings
     * @return number of found substrings from i on
     */
    static int tailRec(String s, int i, int acc) {
        if (i > s.length() - 3) {
            return acc;
        }

        int count = isGood(s, i) ? 1 : 0;
        return tailRec(s, i + 1, acc + count);
    }

    /**
     * Helper for {@linkplain Recursion1#tailRec(String, int, int)}
     *
     * @param s a string
     * @param i a position
     * @return true if in s @ position i there is "abc" or "aba"
     */
    static boolean isGood(String s, int i) {
        char last = s.charAt(i + 2);
        return s.charAt(i) == 'a' && s.charAt(i + 1) == 'b' && (last == 'a' || last == 'c');
    }
}
