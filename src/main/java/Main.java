

public class Main {

    public static void main(String[] args) {

        //blank strings left for tests

        Student Student1 = new Student("olek", "ivanov", "Java Developer", "");
        Student Student2 = new Student("ol", "ivav", "AQE", "");

        Course course1 = new Course("Java", 16);
        Course course2 = new Course("JDBC", 24);
        Course course3 = new Course("Spring", 16);

        Course course4 = new Course("Test Design", 10);
        Course course5 = new Course("Page Object", 16);
        Course course6 = new Course("Selenium", 16);


        Student1.setNewList(course1);
        Student1.setNewList(course2);
        Student1.setNewList(course3);

        Student2.setNewList(course4);
        Student2.setNewList(course5);
        Student2.setNewList(course6);


        Calculations calc1 = new Calculations(Student1);
        int javaDeveloperCoursesDuration = calc1.calculateDuration();
        System.out.println(javaDeveloperCoursesDuration);

        Calculations calc2 = new Calculations(Student2);
        int aqeCoursesDuration = calc2.calculateDuration();
        System.out.println(aqeCoursesDuration);


    }


}




