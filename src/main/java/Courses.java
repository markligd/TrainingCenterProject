import java.util.HashMap;

public class Courses {

    public String nameOfCourse;
    public HashMap<String, Integer> courses;
    public Integer courseDuration;


    public HashMap<String, Integer> getCourses() {
        return courses;
    }


    public Courses(String nameOfCourse, HashMap<String, Integer> courses) {
        this.nameOfCourse = nameOfCourse;
        this.courses = courses;
        setCourseDuration(courses);

    }

    public void setCourseDuration(HashMap<String, Integer> courses) {
        int y = 0;
        for (Integer x : courses.values()) {
            y += x;

        }
        this.courseDuration = y;
    }
}