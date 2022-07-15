import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CalculationsWeekendsTest {

    private Student student1;
    private Student student2;

    public static Stream<Arguments> zeroWeekendDays_10AM(){
        return Stream.of(
                Arguments.of(1,0),
                Arguments.of(8,0),
                Arguments.of(15,0)
        );
    }
    public static Stream<Arguments> twoWeekendDays_10AM(){
        return Stream.of(
                Arguments.of(41,2),
                Arguments.of(49,2)

        );
    }
    public static Stream<Arguments> fourWeekendDays_10AM(){
        return Stream.of(
                Arguments.of(81,4),
                Arguments.of(89,4)

        );
    }
    public static Stream<Arguments> sixWeekendDays_10AM(){
        return Stream.of(
                Arguments.of(121,6),
                Arguments.of(129,6)

        );
    }
    public static Stream<Arguments> eightWeekendDays_10AM(){
        return Stream.of(
                Arguments.of(161,8),
                Arguments.of(169,8)
        );
    }



    @BeforeEach
    public void setUp() {
        String input = "2022-07-11 10:00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startDate = LocalDateTime.parse(input, formatter);

        List<Course> javaCourseList = new ArrayList<>();
        List<Course> aqeCourseList = new ArrayList<>();
        Course course1 = new Course("Java", 16);
        Course course2 = new Course("JDBC", 24);
        Course course3 = new Course("Spring", 16);

        Course course4 = new Course("Test Design", 10);
        Course course5 = new Course("Page Object", 16);
        Course course6 = new Course("Selenium", 16);


        student1 = new Student("Oleg", "Ivanov", "Java Developer", startDate, javaCourseList);
        student2 = new Student("Marek", "Pietruszka", "AQE", startDate, aqeCourseList);


        javaCourseList.add(course1);
        javaCourseList.add(course2);
        javaCourseList.add(course3);

        aqeCourseList.add(course4);
        aqeCourseList.add(course5);
        aqeCourseList.add(course6);

    }


    @Test
    public void itShouldCheckProgramCalculateDuration() {
        //given
        int javaCourseDuration = 56;
        int aqeCourseDuration = 42;


        //when
        int javaResult = Calculations.calculateDuration(student1);
        int aqeResult = Calculations.calculateDuration(student2);

        //then
        Assertions.assertEquals(javaCourseDuration, javaResult);
        Assertions.assertEquals(aqeCourseDuration, aqeResult);


    }


    @ParameterizedTest
    @MethodSource("zeroWeekendDays_10AM")
    public void itShouldCheckCalculationsHowManySaturdaysAndSundaysForZeroWeekendDays(int courseDuration, int expectedWeekendDays) {

        String input = "2022-07-11 10:00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startDate = LocalDateTime.parse(input, formatter);

        //when
        int numberOfWeekendDaysResult = Calculations.calculateHowManySaturdaysAndSundays(courseDuration, startDate);

        Assertions.assertEquals(expectedWeekendDays, numberOfWeekendDaysResult);




    }

    @ParameterizedTest
    @MethodSource("twoWeekendDays_10AM")
    public void itShouldCheckCalculationsHowManySaturdaysAndSundaysForTwoWeekendDays(int courseDuration, int expectedWeekendDays) {

        String input = "2022-07-11 10:00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startDate = LocalDateTime.parse(input, formatter);

        //when
        int numberOfWeekendDaysResult = Calculations.calculateHowManySaturdaysAndSundays(courseDuration, startDate);

        Assertions.assertEquals(expectedWeekendDays, numberOfWeekendDaysResult);




    }

    @ParameterizedTest
    @MethodSource("fourWeekendDays_10AM")
    public void itShouldCheckCalculationsHowManySaturdaysAndSundaysForFourWeekendDays(int courseDuration, int expectedWeekendDays) {

        String input = "2022-07-11 10:00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startDate = LocalDateTime.parse(input, formatter);

        //when
        int numberOfWeekendDaysResult = Calculations.calculateHowManySaturdaysAndSundays(courseDuration, startDate);

        Assertions.assertEquals(expectedWeekendDays, numberOfWeekendDaysResult);




    }


    @ParameterizedTest
    @MethodSource("sixWeekendDays_10AM")
    public void itShouldCheckCalculationsHowManySaturdaysAndSundaysForSixWeekendDays(int courseDuration, int expectedWeekendDays) {

        String input = "2022-07-11 10:00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startDate = LocalDateTime.parse(input, formatter);

        //when
        int numberOfWeekendDaysResult = Calculations.calculateHowManySaturdaysAndSundays(courseDuration, startDate);

        Assertions.assertEquals(expectedWeekendDays, numberOfWeekendDaysResult);




    }

    @ParameterizedTest
    @MethodSource("eightWeekendDays_10AM")
    public void itShouldCheckCalculationsHowManySaturdaysAndSundaysForEightWeekendDays(int courseDuration, int expectedWeekendDays) {

        String input = "2022-07-11 10:00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startDate = LocalDateTime.parse(input, formatter);

        //when
        int numberOfWeekendDaysResult = Calculations.calculateHowManySaturdaysAndSundays(courseDuration, startDate);

        Assertions.assertEquals(expectedWeekendDays, numberOfWeekendDaysResult);


    }

    }



