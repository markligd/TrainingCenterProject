//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.stream.Stream;
//
//class CalculationsEndDateTest {
//
//    public static Stream<Arguments> endDate_10AM() {
//        return Stream.of(
//                Arguments.of(1,"2022-07-11 11:00:00", 0),
//                Arguments.of(8,"2022-07-11 18:00:00", 0),
//                Arguments.of(30,"2022-07-12 17:00:00", 0),
//                Arguments.of(35,"2022-07-12 17:00:00", 0),
//                Arguments.of(41,"2022-07-12 17:00:00", 0),
//                Arguments.of(49,"2022-07-12 17:00:00", 0),
//                Arguments.of(81,"2022-07-12 17:00:00", 0),
//                Arguments.of(89,"2022-07-12 17:00:00", 0),
//                Arguments.of(121,"2022-07-12 17:00:00", 0),
//                Arguments.of(129,"2022-07-12 17:00:00", 0)
//
//        );
//
//    }
//
//    public static Stream<Arguments> endDate_12AM() {
//        return Stream.of(
//                Arguments.of(1,"2022-07-11 11:00:00", 0),
//                Arguments.of(8,"2022-07-11 18:00:00", 0),
//                Arguments.of(30,"2022-07-12 17:00:00", 0),
//                Arguments.of(35,"2022-07-12 17:00:00", 0),
//                Arguments.of(41,"2022-07-12 17:00:00", 0),
//                Arguments.of(49,"2022-07-12 17:00:00", 0),
//                Arguments.of(81,"2022-07-12 17:00:00", 0),
//                Arguments.of(89,"2022-07-12 17:00:00", 0),
//                Arguments.of(121,"2022-07-12 17:00:00", 0),
//                Arguments.of(129,"2022-07-12 17:00:00", 0)
//        );
//
//    }
//
//    public static Stream<Arguments> endDate_3PM() {
//        return Stream.of(
//                Arguments.of(1,"2022-07-11 11:00:00", 0),
//                Arguments.of(8,"2022-07-11 18:00:00", 0),
//                Arguments.of(30,"2022-07-12 17:00:00", 0),
//                Arguments.of(35,"2022-07-12 17:00:00", 0),
//                Arguments.of(41,"2022-07-12 17:00:00", 0),
//                Arguments.of(49,"2022-07-12 17:00:00", 0),
//                Arguments.of(81,"2022-07-12 17:00:00", 0),
//                Arguments.of(89,"2022-07-12 17:00:00", 0),
//                Arguments.of(121,"2022-07-12 17:00:00", 0),
//                Arguments.of(129,"2022-07-12 17:00:00", 0)
//        );
//
//    }
//
//    public static Stream<Arguments> endDate_5PM() {
//        return Stream.of(
//                Arguments.of(1,"2022-07-11 11:00:00", 0),
//                Arguments.of(8,"2022-07-11 18:00:00", 0),
//                Arguments.of(30,"2022-07-12 17:00:00", 0),
//                Arguments.of(35,"2022-07-12 17:00:00", 0),
//                Arguments.of(41,"2022-07-12 17:00:00", 0),
//                Arguments.of(49,"2022-07-12 17:00:00", 0),
//                Arguments.of(81,"2022-07-12 17:00:00", 0),
//                Arguments.of(89,"2022-07-12 17:00:00", 0),
//                Arguments.of(121,"2022-07-12 17:00:00", 0),
//                Arguments.of(129,"2022-07-12 17:00:00", 0)
//        );
//
//    }
//
//    @ParameterizedTest
//    @MethodSource("endDate_10AM")
//    public void itShouldCheckCalculationsEndDate_10AM(int courseDuration, String expectedEndDate, int numberOfWeekendDays){
//        String input = "2022-07-11 10:00:00";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime startDate = LocalDateTime.parse(input, formatter);
//
//        LocalDateTime expectedDate = LocalDateTime.parse(expectedEndDate, formatter);
//
//        //when
//        LocalDateTime endDateResult = Calculations.calculateEndDate(courseDuration, startDate, numberOfWeekendDays);
//
//
//
//        Assertions.assertEquals(expectedDate, endDateResult);
//
//    }
//    @ParameterizedTest
//    @MethodSource("endDate_12AM")
//    public void itShouldCheckCalculationsEndDate_12AM(int courseDuration, String expectedEndDate, int numberOfWeekendDays){
//        String input = "2022-07-11 12:00:00";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime startDate = LocalDateTime.parse(input, formatter);
//
//        LocalDateTime expectedDate = LocalDateTime.parse(expectedEndDate, formatter);
//
//        //when
//        LocalDateTime endDateResult = Calculations.calculateEndDate(courseDuration, startDate, numberOfWeekendDays);
//
//
//
//        Assertions.assertEquals(expectedDate, endDateResult);
//
//    }
//
//    @ParameterizedTest
//    @MethodSource("endDate_3PM")
//    public void itShouldCheckCalculationsEndDate_3PM(int courseDuration, String expectedEndDate, int numberOfWeekendDays){
//        String input = "2022-07-11 15:00:00";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime startDate = LocalDateTime.parse(input, formatter);
//
//        LocalDateTime expectedDate = LocalDateTime.parse(expectedEndDate, formatter);
//
//        //when
//        LocalDateTime endDateResult = Calculations.calculateEndDate(courseDuration, startDate, numberOfWeekendDays);
//
//
//
//        Assertions.assertEquals(expectedDate, endDateResult);
//
//    }
//
//    @ParameterizedTest
//    @MethodSource("endDate_5PM")
//    public void itShouldCheckCalculationsEndDate_5PM(int courseDuration, String expectedEndDate, int numberOfWeekendDays){
//        String input = "2022-07-11 17:00:00";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime startDate = LocalDateTime.parse(input, formatter);
//
//        LocalDateTime expectedDate = LocalDateTime.parse(expectedEndDate, formatter);
//
//        //when
//        LocalDateTime endDateResult = Calculations.calculateEndDate(courseDuration, startDate, numberOfWeekendDays);
//
//
//
//        Assertions.assertEquals(expectedDate, endDateResult);
//
//    }
//
//
//
//
//
//
//}