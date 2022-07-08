import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {




        List<Course> javaCourseList = new ArrayList<>();
        List<Course> aqeCourseList = new ArrayList<>();
        Course course1 = new Course("Java", 16);
        Course course2 = new Course("JDBC", 24);
        Course course3 = new Course("Spring", 16);

        Course course4 = new Course("Test Design", 10);
        Course course5 = new Course("Page Object", 16);
        Course course6 = new Course("Selenium", 16);


        Student student1 = new Student("olek", "ivanov", "Java Developer", "", javaCourseList);
        Student student2 = new Student("ol", "ivav", "AQE", "", aqeCourseList );



        javaCourseList.add(course1);
        javaCourseList.add(course2);
        javaCourseList.add(course3);

        aqeCourseList.add(course4);
        aqeCourseList.add(course5);
        aqeCourseList.add(course6);


        System.out.println(Calculations.calculateDuration(student1));
        System.out.println(Calculations.calculateDuration(student2));



    }


}




