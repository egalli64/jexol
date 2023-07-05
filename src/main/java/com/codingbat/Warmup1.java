/**
 * CodingBat Java Warmup 1 - https://codingbat.com/java/Warmup-1
 * My repo: https://github.com/egalli64/jex/
 */
package com.codingbat;

public class Warmup1 {
    /**
     * codingbat.com/prob/p173784
     * 
     * @param str a string
     * @return true if it contains [1..3] 'e'
     */
    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count += 1;
            }
        }
        return count > 0 && count < 4;
    }

    /**
     * codingbat.com/prob/p196441
     * 
     * @param str a non-empty string
     * @param n   1 or more
     * @return a string with chars in position 0, and then every Nth char
     */
    public static String everyNth(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += n) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    /*-
     * a+  b+  neg return 
     * T   T   T   F   
     * T   T   F   F
     * T   F   T   F
     * T   F   F   T <-
     * F   T   T   F
     * F   T   F   T <-
     * F   F   T   T <-
     * F   F   F   F
     */
    public static boolean posNegEx(int a, int b, boolean negative) {
        return a > 0 ^ b > 0 && !negative || a < 0 && b < 0 && negative;
    }

    /**
     * codingbat.com/prob/p177372
     * 
     * @param a first positive value
     * @param b second positive value
     * @return the largest in [10..20] or 0
     */
    public static int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (in1020(a)) {
            return a;
        }
        if (in1020(b)) {
            return b;
        }
        return 0;
    }

    /**
     * Helper for {@linkplain Warmup1#max1020(int, int)}
     * 
     * @param value a value
     * @return true if in [10..20]
     */
    private static boolean in1020(int value) {
        return value > 9 && value < 21;
    }

    /**
     * codingbat.com/prob/p125339
     * 
     * @param a first non-negative value
     * @param b second non-negative value
     * @return true if they have the same last digit
     */
    public static boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

    /**
     * codingbat.com/prob/p125268
     * 
     * @param str a possibly empty string
     * @return the last 3 chars (or less) to upper
     */
    public static String endUp(String str) {
        int pos = str.length() - Math.min(3, str.length());
        return str.substring(0, pos) + str.substring(pos).toUpperCase();
    }
}
