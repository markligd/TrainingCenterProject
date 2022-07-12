import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StudentPositionTest {

    private Student student1;
    private Student student2;


    @Before
    public void setUp(){
        String input = "2022-07-11 10:00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startDate = LocalDateTime.parse(input, formatter);

        List<Course> javaCourseList = new ArrayList<>();
        List<Course> aqeCourseList = new ArrayList<>();
        student1 = new Student(
                "Oleg",
                "Ivanov",
                "Java Developer",
                startDate,
                javaCourseList);

        student2 = new Student(
                "Marek",
                "Pietruszka",
                "AQE",
                startDate,
                aqeCourseList);

    }


    @Test
    public void itShouldCheckStudentPosition(){

        //given
        String student1Position = "Java Developer";
        String student2Position = "AQE";

        //when
//        String resultStudent1Position = student1.getPosition();
//        String resultStudent2Position = student2.getPosition();

        //then
        assertThat(student1.getPosition()).isEqualTo("Java Developer");
        assertThat(student2.getPosition()).isEqualTo("AQE");










    }
}
