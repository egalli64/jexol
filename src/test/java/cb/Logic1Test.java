package cb;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Logic1Test {
    @ParameterizedTest
    @CsvSource({"30,false,false", "50,false,true", "70,true,true"})
    void cigarPartyExamples(int cigars, boolean isWeekend, boolean expected) {
        assertThat(Logic1.cigarParty(cigars, isWeekend)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"60,false,0", "65,false,1", "65,true,0"})
    void caughtSpeedingExamples(int speed, boolean isBirthday, int expected) {
        assertThat(Logic1.caughtSpeeding(speed, isBirthday)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({"6,4,true", "4,5,false", "1,5,true"})
    void love6Examples(int first, int second, boolean expected) {
        assertThat(Logic1.love6(first, second)).isEqualTo(expected);
    }
}