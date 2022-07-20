import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        String input = "2022-07-11 12:00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startDate = LocalDateTime.parse(input, formatter);

        LocalDateTime reportDate = LocalDateTime.now();

        List<Student> studentsList = new ArrayList<>();
        List<Course> javaCourseList = new ArrayList<>();
        List<Course> aqeCourseList = new ArrayList<>();
        Course course1 = new Course("Java", 16);
        Course course2 = new Course("JDBC", 24);
        Course course3 = new Course("Spring", 16);

        Course course4 = new Course("Test Design", 10);
        Course course5 = new Course("Page Object", 16);
        Course course6 = new Course("Selenium", 16);

        Student student1 = new Student("Oleg", "Ivanov", "Java Developer", startDate, javaCourseList);
        Student student2 = new Student("Marek", "Pietruszka", "AQE", startDate, aqeCourseList);


        javaCourseList.add(course1);
        javaCourseList.add(course2);
        javaCourseList.add(course3);
        aqeCourseList.add(course4);
        aqeCourseList.add(course5);
        aqeCourseList.add(course6);

        studentsList.add(student1);
        studentsList.add(student2);


        studentsList.forEach(student -> ReportGenerator.generateReport(student, Calculations.calculateDuration(student), startDate, reportDate));

    }


}




