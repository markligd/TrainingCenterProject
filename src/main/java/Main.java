import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> JavaDeveloper = new HashMap<>();
        JavaDeveloper.put("Java", 16);
        JavaDeveloper.put("JDBC", 24);
        JavaDeveloper.put("Spring", 16);
        Courses javaDeveloperCourses = new Courses("Java Developer", JavaDeveloper);
        System.out.println(javaDeveloperCourses.courseDuration);

        HashMap<String, Integer> AQE = new HashMap<>();
        AQE.put("Test Design", 10);
        AQE.put("Page Object", 16);
        AQE.put("Selenium", 16);
        Courses aqeCourses = new Courses("AQE", AQE);
        System.out.println(aqeCourses.courseDuration);


        Student Student1 = new Student("olek", "ivanov", "Java Developer", "");
        Student Student2 = new Student("ol", "ivav", "AQE", "");

        Student1.setNewList(javaDeveloperCourses);
        Student2.setNewList(aqeCourses);

        System.out.println(Student1.newList.get(0).courses);
        System.out.println(Student2.newList.get(0).courses);


        System.out.println("Enter launch date of first person DD-MM-YYYY");
        String input = "2022-07-11 10:00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime startDate = LocalDateTime.parse(input, formatter);
//        LocalDateTime reportDate = LocalDateTime.now();
        LocalDateTime reportDate = LocalDateTime.parse("2022-07-13 12:00:00", formatter);


        Calculations newCalc = new Calculations();
        newCalc.sumCoursesDuration(JavaDeveloper, startDate, reportDate);


//
//        String input = "";
//        try {
//            System.out.println("Enter launch date of first person DD-MM-YYYY");
//            Scanner scanner = new Scanner(System.in);
//            input = scanner.nextLine();
//            //przerobic na date
//
//            Date newDate = new SimpleDateFormat("dd-MM-yyyy").parse(input);
//            System.out.println(newDate);
//
//
//        } catch (Exception e){
//            System.out.println(e);
//        }


    }


}




