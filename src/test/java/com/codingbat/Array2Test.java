package com.codingbat;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Array2Test {
    @Test
    void no14Example1() {
        int[] input = { 1, 2, 3 };
        assertThat(Array2.no14(input)).isTrue();
    }

    @Test
    void matchUpExample1() {
        int[] left = { 1, 2, 3 };
        int[] right = { 2, 3, 10 };
        int expected = 2;
        assertThat(Array2.matchUp(left, right)).isEqualTo(expected);
    }

    @Test
    void fizzArray2Example1() {
        int input = 4;
        String[] expected = { "0", "1", "2", "3" };
        assertThat(Array2.fizzArray2(input)).isEqualTo(expected);
    }

    @Test
    void isEverywhereExample1() {
        int[] input = { 1, 2, 1, 3 };
        int target = 1;
        assertThat(Array2.isEverywhere(input, target)).isTrue();
    }

    @Test
    void either24Example1() {
        int[] input = { 1, 2, 2 };
        assertThat(Array2.either24(input)).isTrue();
    }

    @Test
    void has77Example1() {
        int[] input = { 1, 7, 7 };
        assertThat(Array2.has77(input)).isTrue();
    }

    @Test
    void has12Example1() {
        int[] input = { 1, 3, 2 };
        assertThat(Array2.has12(input)).isTrue();
    }

    @Test
    void modThreeExample1() {
        int[] input = { 2, 1, 3, 5 };
        assertThat(Array2.modThree(input)).isTrue();
    }

    @Test
    void haveThreeExample1() {
        int[] input = { 3, 1, 3, 1, 3 };
        assertThat(Array2.haveThree(input)).isTrue();
    }

    @Test
    void twoTwoExample1() {
        int[] input = { 4, 2, 2, 3 };
        assertThat(Array2.twoTwo(input)).isTrue();
    }

    @Test
    void sameEndsExample1() {
        int[] input = { 5, 6, 45, 99, 13, 5, 6 };
        int len = 1;
        assertThat(Array2.sameEnds(input, len)).isFalse();
    }

    @Test
    void sameEndsExample2() {
        int[] input = { 5, 6, 45, 99, 13, 5, 6 };
        int len = 2;
        assertThat(Array2.sameEnds(input, len)).isTrue();
    }

    @Test
    void tripleUpExample1() {
        int[] input = { 1, 4, 5, 6, 2 };
        assertThat(Array2.tripleUp(input)).isTrue();
    }

    @Test
    void fizzArray3Example1() {
        int begin = 5;
        int end = 10;
        int[] expected = { 5, 6, 7, 8, 9 };
        assertThat(Array2.fizzArray3(begin, end)).isEqualTo(expected);
    }

    @Test
    void shiftLeftExample1() {
        int[] input = { 6, 2, 5, 3 };
        int[] expected = { 2, 5, 3, 6 };
        assertThat(Array2.shiftLeft(input)).isEqualTo(expected);
    }

    @Test
    void tenRunExample1() {
        int[] input = { 2, 10, 3, 4, 20, 5 };
        int[] expected = { 2, 10, 10, 10, 20, 20 };
        assertThat(Array2.tenRun(input)).isEqualTo(expected);
    }

    @Test
    void pre4Example1() {
        int[] input = { 1, 2, 4, 1 };
        int[] expected = { 1, 2 };
        assertThat(Array2.pre4(input)).isEqualTo(expected);
    }

    @Test
    void post4Example1() {
        int[] input = { 2, 4, 1, 2 };
        int[] expected = { 1, 2 };
        assertThat(Array2.post4(input)).isEqualTo(expected);
    }

    @Test
    void notAloneExample10() {
        int[] input = { 1, 1, 1, 2 };
        int value = 1;
        int[] expected = { 1, 1, 1, 2 };
        assertThat(Array2.notAlone(input, value)).isEqualTo(expected);
    }

    @Test
    void zeroFrontExample1() {
        int[] input = { 1, 0, 0, 1 };
        int[] expected = { 0, 0, 1, 1 };
        assertThat(Array2.zeroFront(input)).isEqualTo(expected);
    }

    @Test
    void withoutTenExample1() {
        int[] input = { 1, 10, 10, 2 };
        int[] expected = { 1, 2, 0, 0 };
        assertThat(Array2.withoutTen(input)).isEqualTo(expected);
    }

    @Test
    void zeroMaxExample1() {
        int[] input = { 0, 5, 0, 3 };
        int[] expected = { 5, 5, 3, 3 };
        assertThat(Array2.zeroMax(input)).isEqualTo(expected);
    }

    @Test
    void evenOddExample1() {
        int[] input = { 1, 0, 1, 0, 0, 1, 1 };
        int[] expected = { 0, 0, 0, 1, 1, 1, 1 };
        assertThat(Array2.evenOdd(input)).isEqualTo(expected);
    }

    @Test
    void fizzBuzzExample1() {
        int begin = 1;
        int end = 6;
        String[] expected = { "1", "2", "Fizz", "4", "Buzz" };
        assertThat(Array2.fizzBuzz(begin, end)).isEqualTo(expected);
    }

}