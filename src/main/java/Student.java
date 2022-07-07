import java.util.ArrayList;

public class Student {

    public String firstName;
    public String secondName;
    public String position;
    public String startDate;
    public ArrayList<Courses> newList;


    public Student(String firstName, String secondName, String position, String startDate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.position = position;
        this.startDate = startDate;
        this.newList = new ArrayList<Courses>();

    }

    public ArrayList<Courses> getNewList() {
        return newList;
    }

    public void setNewList(Courses newList) {
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
