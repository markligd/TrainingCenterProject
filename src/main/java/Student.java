import java.util.ArrayList;

public class Student {

    private String firstName;
    private String secondName;
    private String position;
    private String startDate; // here will be "launch date", when employee starts work implemented with use of scanner
    private ArrayList<Course> newList;


    public Student(String firstName, String secondName, String position, String startDate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.position = position;
        this.startDate = startDate;
        this.newList = new ArrayList<>();

    }

    public ArrayList<Course> getNewList() {
        return newList;
    }

    public void setNewList(Course newList) {
        this.newList.add(newList);
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
