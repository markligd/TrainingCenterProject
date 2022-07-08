import java.util.List;

public class Student {

    private String firstName;
    private String secondName;
    private String position;
    private String startDate;
    private List<Course> courseList;

//start date as localdatetime

    public Student(String firstName, String secondName, String position, String startDate, List<Course> courseList) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.position = position;
        this.startDate = startDate;
        this.courseList = courseList;

    }

    public List<Course> getCourseList() {
        return courseList;
    }

    //ustawic cala liste jako parametr
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPosition() {
        return position;
    }


}
