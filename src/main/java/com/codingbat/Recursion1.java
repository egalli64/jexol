/**
 * https://codingbat.com/java/Recursion-1
 */
package com.codingbat;

public class Recursion1 {
    /**
     * codingbat.com/prob/p186177
     *
     * @param str string
     * @param sub non-empty
     * @return count non overlapping sub in str
     */
    public static int strCount(String str, String sub) {
        return strCount(str, 0, sub);
    }

    /**
     * Helper for {@linkplain Recursion1#strCount(String, String)}
     *
     * @param str string
     * @param i   from position
     * @param sub non-empty
     * @return count non overlapping sub in str from i on
     */
    private static int strCount(String str, int i, String sub) {
        if (str.length() - i < sub.length()) {
            return 0;
        }
        if (isMatching(str, i, sub, 0)) {
            return 1 + strCount(str, i + sub.length(), sub);
        } else {
            return strCount(str, i + 1, sub);
        }
    }

    /**
     * Helper for {@linkplain Recursion1#strCount(String, String)},
     * {@linkplain Recursion1#strCopies(String, String, int)}, and
     * {@linkplain Recursion1#strDist(String, String)}
     *
     * @param str string
     * @param i   start position in str
     * @param sub substring
     * @param j   start position in sub
     * @return true if str and sub match from i, j on
     */
    private static boolean isMatching(String str, int i, String sub, int j) {
        if (j == sub.length()) {
            return true;
        }
        if (str.charAt(i) != sub.charAt(j)) {
            return false;
        }
        return isMatching(str, i + 1, sub, j + 1);
    }

    /**
     * codingbat.com/prob/p118182
     *
     * @param str string
     * @param sub non-empty
     * @param n   non-negative, number of copies
     * @return true if there are the required n (overlapping) copies
     */
    public static boolean strCopies(String str, String sub, int n) {
        return strCopies(str, 0, sub) == n;
    }

    /**
     * Helper for {@linkplain Recursion1#strCopies(String, String, int)}
     *
     * @param str string
     * @param i   start position
     * @param sub non-empty
     * @return count sub in str from i
     */
    private static int strCopies(String str, int i, String sub) {
        if (str.length() - i < sub.length()) {
            return 0;
        }
        return (isMatching(str, i, sub, 0) ? 1 : 0) + strCopies(str, i + 1, sub);
    }

    /**
     * codingbat.com/prob/p195413
     *
     * @param str string
     * @param sub non-empty
     * @return size of the largest substring starting and ending by sub
     */
    public static int strDist(String str, String sub) {
        int begin = firstSubLeft(str, 0, sub);
        if (begin == -1) {
            return 0;
        }

        int end = lastSubRight(str, str.length() - sub.length(), sub) + sub.length();
        return end - begin;
    }

    /**
     * Helper for {@linkplain Recursion1#strDist(String, String)}
     *
     * @param s string
     * @param i position
     * @return the first '(' from i
     */
    private static int firstSubLeft(String s, int i, String sub) {
        if (i + sub.length() > s.length()) {
            return -1;
        }
        if (isMatching(s, i, sub, 0)) {
            return i;
        }
        return firstSubLeft(s, i + 1, sub);
    }

    /**
     * Helper for {@linkplain Recursion1#strDist(String, String)}
     *
     * @param s string
     * @param i position
     * @return the last ')' up to i
     */
    private static int lastSubRight(String s, int i, String sub) {
        if (i < 0) {
            return -1;
        }
        if (isMatching(s, i, sub, 0)) {
            return i;
        }
        return lastSubRight(s, i - 1, sub);
    }
}
