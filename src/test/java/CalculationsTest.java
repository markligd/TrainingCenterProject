import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CalculationsTest {

    private Student student1;
    private Student student2;

    @Before
    public void setUp(){
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
        Assert.assertEquals(javaCourseDuration, javaResult);
        Assert.assertEquals(aqeCourseDuration, aqeResult);


    }


    @Test
    public  void itShouldCheckCalculationsHowManySaturdaysAndSundaysForZeroWeekendDays() {
        //given
        int numberOfWeekendDays_0 = 0;

        String input = "2022-07-11 10:00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startDate = LocalDateTime.parse(input, formatter);

        //when
        int numberOfWeekendDaysResult_0_1 = Calculations.calculateHowManySaturdaysAndSundays(1, startDate);
        int numberOfWeekendDaysResult_0_2 = Calculations.calculateHowManySaturdaysAndSundays(8, startDate);
        int numberOfWeekendDaysResult_0_3 = Calculations.calculateHowManySaturdaysAndSundays(15, startDate);

        //then
        Assert.assertEquals(numberOfWeekendDays_0, numberOfWeekendDaysResult_0_1);
        Assert.assertEquals(numberOfWeekendDays_0, numberOfWeekendDaysResult_0_2);
        Assert.assertEquals(numberOfWeekendDays_0, numberOfWeekendDaysResult_0_3);


        }
        @Test
        public  void itShouldCheckCalculationsHowManySaturdaysAndSundaysForTwoWeekendDays(){

            String input = "2022-07-11 10:00:00";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime startDate = LocalDateTime.parse(input, formatter);

            int numberOfWeekendDays_0 = 0;
            int numberOfWeekendDays_2 = 2;

            int numberOfWeekendDaysResult_2_1 = Calculations.calculateHowManySaturdaysAndSundays(40, startDate);
            int numberOfWeekendDaysResult_2_2 = Calculations.calculateHowManySaturdaysAndSundays(41, startDate);
            int numberOfWeekendDaysResult_2_3 = Calculations.calculateHowManySaturdaysAndSundays(49, startDate);

            Assert.assertEquals(numberOfWeekendDays_0, numberOfWeekendDaysResult_2_1);
            Assert.assertEquals(numberOfWeekendDays_2, numberOfWeekendDaysResult_2_2);
            Assert.assertEquals(numberOfWeekendDays_2, numberOfWeekendDaysResult_2_3);



        }



        @Test
        public  void itShouldCheckCalculationsHowManySaturdaysAndSundaysForFourWeekendDays(){

            String input = "2022-07-11 10:00:00";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime startDate = LocalDateTime.parse(input, formatter);


            int numberOfWeekendDays_2 = 2;
            int numberOfWeekendDays_4 = 4;

            int numberOfWeekendDaysResult_4_1 = Calculations.calculateHowManySaturdaysAndSundays(80, startDate);
            int numberOfWeekendDaysResult_4_2 = Calculations.calculateHowManySaturdaysAndSundays(81, startDate);
            int numberOfWeekendDaysResult_4_3 = Calculations.calculateHowManySaturdaysAndSundays(89, startDate);

            Assert.assertEquals(numberOfWeekendDays_2, numberOfWeekendDaysResult_4_1);
            Assert.assertEquals(numberOfWeekendDays_4, numberOfWeekendDaysResult_4_2);
            Assert.assertEquals(numberOfWeekendDays_4, numberOfWeekendDaysResult_4_3);



        }


        @Test
        public  void itShouldCheckCalculationsHowManySaturdaysAndSundaysForSixWeekendDays(){

            String input = "2022-07-11 10:00:00";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime startDate = LocalDateTime.parse(input, formatter);


            int numberOfWeekendDays_4 = 4;
            int numberOfWeekendDays_6 = 6;


            int numberOfWeekendDaysResult_6_1 = Calculations.calculateHowManySaturdaysAndSundays(120, startDate);
            int numberOfWeekendDaysResult_6_2 = Calculations.calculateHowManySaturdaysAndSundays(121, startDate);
            int numberOfWeekendDaysResult_6_3 = Calculations.calculateHowManySaturdaysAndSundays(129, startDate);

            Assert.assertEquals(numberOfWeekendDays_4, numberOfWeekendDaysResult_6_1);
            Assert.assertEquals(numberOfWeekendDays_6, numberOfWeekendDaysResult_6_2);
            Assert.assertEquals(numberOfWeekendDays_6, numberOfWeekendDaysResult_6_3);



        }

        @Test
        public  void itShouldCheckCalculationsHowManySaturdaysAndSundaysForEightWeekendDays(){

            String input = "2022-07-11 10:00:00";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime startDate = LocalDateTime.parse(input, formatter);


            int numberOfWeekendDays_6 = 6;
            int numberOfWeekendDays_8 = 8;



            int numberOfWeekendDaysResult_8_1 = Calculations.calculateHowManySaturdaysAndSundays(160, startDate);
            int numberOfWeekendDaysResult_8_2 = Calculations.calculateHowManySaturdaysAndSundays(161, startDate);
            int numberOfWeekendDaysResult_8_3 = Calculations.calculateHowManySaturdaysAndSundays(169, startDate);



            Assert.assertEquals(numberOfWeekendDays_6, numberOfWeekendDaysResult_8_1);
            Assert.assertEquals(numberOfWeekendDays_8, numberOfWeekendDaysResult_8_2);
            Assert.assertEquals(numberOfWeekendDays_8, numberOfWeekendDaysResult_8_3);

        }








}
