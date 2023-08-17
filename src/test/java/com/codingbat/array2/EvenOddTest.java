/*
  CodingBat Java Array 2 - https://codingbat.com/java/Array-2

  My repository - https://github.com/egalli64/jex/
 */
package com.codingbat.array2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class EvenOddTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 0, 1, 0, 0, 1, 1 }, new int[] { 0, 0, 0, 1, 1, 1, 1 }), //
                Arguments.of(new int[] { 3, 3, 2 }, new int[] { 2, 3, 3 }), //
                Arguments.of(new int[] { 2, 2, 2 }, new int[] { 2, 2, 2 }) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] data, int[] expected) {
        assertThat(EvenOdd.solution(data)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void inPlaceExamples(int[] data, int[] expected) {
        assertThat(EvenOdd.inPlace(data)).isEqualTo(expected);
    }
}
