import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

class CalculationsEndDateTest {

    public static Stream<Arguments> endDate() {
        return Stream.of(
                Arguments.of("2022-07-11 10:00:00", 1, "2022-07-11 11:00:00", 0),
                Arguments.of("2022-07-11 10:00:00", 8, "2022-07-11 18:00:00", 0),
                Arguments.of("2022-07-11 10:00:00", 30, "2022-07-14 16:00:00", 0),
                Arguments.of("2022-07-11 10:00:00", 35, "2022-07-15 13:00:00", 0),
                Arguments.of("2022-07-11 10:00:00", 41, "2022-07-18 11:00:00", 2),
                Arguments.of("2022-07-11 10:00:00", 49, "2022-07-19 11:00:00", 2),
                Arguments.of("2022-07-11 10:00:00", 55, "2022-07-19 17:00:00", 2),
                Arguments.of("2022-07-11 10:00:00", 81, "2022-07-25 11:00:00", 4),
                Arguments.of("2022-07-11 10:00:00", 89, "2022-07-26 11:00:00", 4),
                Arguments.of("2022-07-11 10:00:00", 114, "2022-07-29 12:00:00", 4),
                Arguments.of("2022-07-11 10:00:00", 121, "2022-08-01 11:00:00", 6),
                Arguments.of("2022-07-11 10:00:00", 129, "2022-08-02 11:00:00", 6),

                Arguments.of("2022-07-11 12:00:00", 1, "2022-07-11 13:00:00", 0),
                Arguments.of("2022-07-11 12:00:00", 8, "2022-07-12 12:00:00", 0),
                Arguments.of("2022-07-11 12:00:00", 30, "2022-07-14 18:00:00", 0),
                Arguments.of("2022-07-11 12:00:00", 35, "2022-07-15 15:00:00", 0),
                Arguments.of("2022-07-11 12:00:00", 41, "2022-07-18 13:00:00", 2),
                Arguments.of("2022-07-11 12:00:00", 49, "2022-07-19 13:00:00", 2),
                Arguments.of("2022-07-11 12:00:00", 55, "2022-07-20 11:00:00", 2),
                Arguments.of("2022-07-11 12:00:00", 81, "2022-07-25 13:00:00", 4),
                Arguments.of("2022-07-11 12:00:00", 89, "2022-07-26 13:00:00", 4),
                Arguments.of("2022-07-11 12:00:00", 114, "2022-07-29 14:00:00", 4),
                Arguments.of("2022-07-11 12:00:00", 121, "2022-08-01 13:00:00", 6),
                Arguments.of("2022-07-11 12:00:00", 129, "2022-08-02 13:00:00", 6),

                Arguments.of("2022-07-11 15:00:00", 1, "2022-07-11 16:00:00", 0),
                Arguments.of("2022-07-11 15:00:00", 8, "2022-07-12 15:00:00", 0),
                Arguments.of("2022-07-11 15:00:00", 30, "2022-07-15 13:00:00", 0),
                Arguments.of("2022-07-11 15:00:00", 35, "2022-07-15 18:00:00", 0),
                Arguments.of("2022-07-11 15:00:00", 41, "2022-07-18 16:00:00", 2),
                Arguments.of("2022-07-11 15:00:00", 49, "2022-07-19 16:00:00", 2),
                Arguments.of("2022-07-11 15:00:00", 55, "2022-07-20 14:00:00", 2),
                Arguments.of("2022-07-11 15:00:00", 81, "2022-07-25 16:00:00", 4),
                Arguments.of("2022-07-11 15:00:00", 89, "2022-07-26 16:00:00", 4),
                Arguments.of("2022-07-11 15:00:00", 114, "2022-07-29 17:00:00", 4),
                Arguments.of("2022-07-11 15:00:00", 121, "2022-08-01 16:00:00", 6),
                Arguments.of("2022-07-11 15:00:00", 129, "2022-08-02 16:00:00", 6),

                Arguments.of("2022-07-11 17:00:00", 1, "2022-07-11 18:00:00", 0),
                Arguments.of("2022-07-11 17:00:00", 8, "2022-07-12 17:00:00", 0),
                Arguments.of("2022-07-11 17:00:00", 30, "2022-07-15 15:00:00", 0),
                Arguments.of("2022-07-11 17:00:00", 35, "2022-07-18 12:00:00", 2),
                Arguments.of("2022-07-11 17:00:00", 41, "2022-07-18 18:00:00", 2),
                Arguments.of("2022-07-11 17:00:00", 49, "2022-07-19 18:00:00", 2),
                Arguments.of("2022-07-11 17:00:00", 55, "2022-07-20 16:00:00", 2),
                Arguments.of("2022-07-11 17:00:00", 81, "2022-07-25 18:00:00", 4),
                Arguments.of("2022-07-11 17:00:00", 89, "2022-07-26 18:00:00", 4),
                Arguments.of("2022-07-11 17:00:00", 114, "2022-08-01 11:00:00", 6),
                Arguments.of("2022-07-11 17:00:00", 121, "2022-08-01 18:00:00", 6),
                Arguments.of("2022-07-11 17:00:00", 129, "2022-08-02 18:00:00", 6)

        );

    }


    @ParameterizedTest
    @MethodSource("endDate")
    public void itShouldCheckCalculationsEndDate_10AM(String inputDate, int courseDuration, String expectedEndDate, int numberOfWeekendDays) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startDate = LocalDateTime.parse(inputDate, formatter);

        LocalDateTime expectedDate = LocalDateTime.parse(expectedEndDate, formatter);

        LocalDateTime endDateResult = Calculations.calculateEndDate(courseDuration, startDate, numberOfWeekendDays);

        Assertions.assertEquals(expectedDate, endDateResult);

    }

}