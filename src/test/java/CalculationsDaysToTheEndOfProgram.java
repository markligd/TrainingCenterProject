import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class CalculationsDaysToTheEndOfProgram {
    public static Stream<Arguments> durationInHoursToTheEnd() {
        return Stream.of(
                Arguments.of("2022-07-20 10:00:00", 4, "2022-07-20 12:00:00", 2),
                Arguments.of("2022-07-20 10:00:00", 24, "2022-07-20 12:00:00", 54),
                Arguments.of("2022-07-20 16:00:00", 2, "2022-07-20 12:00:00", 6),
                Arguments.of("2022-07-20 10:00:00", 2, "2022-07-20 12:00:00", 0),
                Arguments.of("2022-07-20 10:00:00", 2, "2022-07-20 14:00:00", 2),
                Arguments.of("2022-07-19 12:00:00", 10, "2022-07-22 12:00:00", 46),
                Arguments.of("2022-07-18 13:00:00", 15, "2022-07-21 17:00:00", 29),
                Arguments.of("2022-07-19 14:00:00", 2, "2022-07-20 16:00:00", 24)


        );
    }


    @ParameterizedTest
    @MethodSource("durationInHoursToTheEnd")
    public void itShouldCalculateDaysToTheEndOfCourseProgram(String launchDate, int sumOfCoursesDuration, String rDate, int expectedHours) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startDate = LocalDateTime.parse(launchDate, formatter);
        LocalDateTime reportDate = LocalDateTime.parse(rDate, formatter);


        Long resultDurationInHours = Calculations.calculateDaysToTheEndOfCourseProgram(sumOfCoursesDuration, startDate, reportDate);

        Assertions.assertEquals(expectedHours, resultDurationInHours);


    }
}
