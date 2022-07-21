import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CalculationsProgramDuration {
    private Student student1;
    private Student student2;


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
    public void itShouldCheckProgramCalculateDurationForStudent1() {

        int javaCourseDuration = 56;

        int javaResult = Calculations.calculateDuration(student1);

        Assertions.assertEquals(javaCourseDuration, javaResult);



    }
    @Test
    public void itShouldCheckProgramCalculateDurationForStudent2() {

        int aqeCourseDuration = 42;

        int aqeResult = Calculations.calculateDuration(student2);

        Assertions.assertEquals(aqeCourseDuration, aqeResult);
    }

}
