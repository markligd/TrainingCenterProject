import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ReportGenerator {


    public static void generateReport(Student student, int sumOfCoursesDuration, LocalDateTime startDate, LocalDateTime reportDate) {
        int weekendDays = Calculations.calculateHowManySaturdaysAndSundays(sumOfCoursesDuration, startDate);
        LocalDateTime endDate = Calculations.calculateEndDate(sumOfCoursesDuration, startDate, weekendDays);
        System.out.println("Please Choose type of report" + " 0" + " or " + "blank space" + " - short report, anything else for full report");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        if (input.equals(" ") || input.equals("0")) {
            String pattern = "dd MMMMM yyyy, EEEEE, HH:00";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("eng", "GB"));

            String date = simpleDateFormat.format(new Date());
            System.out.println("Generating report, date - " + date);
            System.out.println("STUDENT " + student.getFirstName() + " " + student.getSecondName() + " (" + student.getPosition() + ")");
            Calculations.calculateDaysToTheEndOfCourseProgram(sumOfCoursesDuration, startDate, reportDate);


        } else {
            //long
            String pattern = "dd MMMMM yyyy, EEEEE, HH:00";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("eng", "GB"));
            String date = simpleDateFormat.format(new Date());
            System.out.println("Generating report date - " + date);

            System.out.println(student.getFirstName() + "  " + student.getSecondName());
            System.out.println("Working Time: 10-18");
            System.out.println(student.getPosition());
            Calculations.calculateDaysToTheEndOfCourseProgram(sumOfCoursesDuration, startDate, reportDate);

        }


    }


}
