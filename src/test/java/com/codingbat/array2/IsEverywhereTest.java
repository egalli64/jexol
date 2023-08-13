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

class IsEverywhereTest {
    static Stream<Arguments> provider() {
        return Stream.of( //
                Arguments.of(new int[] { 1, 2, 1, 3 }, 1, true), //
                Arguments.of(new int[] { 1, 2, 1, 3 }, 2, false), //
                Arguments.of(new int[] { 1, 2, 1, 3, 4 }, 1, false) //
        );
    }

    @ParameterizedTest
    @MethodSource("provider")
    void solutionExamples(int[] data, int value, boolean expected) {
        assertThat(IsEverywhere.solution(data, value)).isEqualTo(expected);
    }

    static Stream<Arguments> baseProvider() {
        return Stream.of( //
                Arguments.of(new int[] {}, 1, true), //
                Arguments.of(new int[] { 1 }, 1, true), //
                Arguments.of(new int[] { 2 }, 1, true) //
        );
    }

    @ParameterizedTest
    @MethodSource("baseProvider")
    void solutionBaseCases(int[] data, int value, boolean expected) {
        assertThat(IsEverywhere.solution(data, value)).isEqualTo(expected);
    }
}
