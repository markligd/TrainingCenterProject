import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class CalculationsWeekendsTest {

    public static Stream<Arguments> WeekendDays() {
        return Stream.of(
                Arguments.of(1, 0),
                Arguments.of(8, 0),
                Arguments.of(15, 0),
                Arguments.of(41, 2),
                Arguments.of(49, 2),
                Arguments.of(81, 4),
                Arguments.of(89, 4),
                Arguments.of(121, 6),
                Arguments.of(129, 6),
                Arguments.of(161, 8),
                Arguments.of(169, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("WeekendDays")
    public void itShouldCheckCalculationsHowManySaturdaysAndSundays(int courseDuration, int expectedWeekendDays) {

        String input = "2022-07-11 10:00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startDate = LocalDateTime.parse(input, formatter);

        //when
        int numberOfWeekendDaysResult = Calculations.calculateHowManySaturdaysAndSundays(courseDuration, startDate);

        Assertions.assertEquals(expectedWeekendDays, numberOfWeekendDaysResult);


    }


}



