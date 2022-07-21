import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ReportGenerator {


    public static void generateReport(Student student, int sumOfCoursesDuration, LocalDateTime startDate, LocalDateTime reportDate) {
        int weekendDays = Calculations.calculateHowManySaturdaysAndSundays(sumOfCoursesDuration, startDate);
        LocalDateTime endDate = Calculations.calculateEndDate(sumOfCoursesDuration, startDate, weekendDays);


        System.out.println("Please choose type of report. Please Type: " + " S - for short report or F for full report");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.toUpperCase(Locale.ROOT);

        String pattern = "dd MMMMM yyyy, EEEEE, HH:00";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("eng", "GB"));
        String date = simpleDateFormat.format(new Date());


        switch (input) {
            case "S":
                System.out.println("Generating report, date - " + date);
                System.out.println("STUDENT " + student.getFirstName() + " " + student.getSecondName() + " (" + student.getPosition() + ")");
                Calculations.calculateDaysToTheEndOfCourseProgram(sumOfCoursesDuration, startDate, reportDate);
                break;

            case "F":
                System.out.println("Generating report, date - " + date);
                System.out.println(student.getFirstName() + " " + student.getSecondName());
                System.out.println("Program Duration: " + Calculations.calculateDuration(student) + " hours");
                System.out.println("End Date: " + endDate);
                System.out.println(student.getPosition());
                Calculations.calculateDaysToTheEndOfCourseProgram(sumOfCoursesDuration, startDate, reportDate);
                break;

            default:
                throw new IllegalArgumentException
                        ("Unrecognized key for report type. Please choose F - Full Report or S - Small Report ");

        }

    }


}
