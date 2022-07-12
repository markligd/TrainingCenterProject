import java.time.LocalDateTime;
import java.util.Objects;

public class Calculations {

    private Calculations() {

    }

    //zamiana na stream
    public static int calculateDuration(Student student) {
        int sumOfCoursesDuration = 0;
        for (int i = 0; i < student.getCourseList().size(); i++) {
            sumOfCoursesDuration += (student.getCourseList().get(i).getDuration());
        }
        return sumOfCoursesDuration;
    }


    public static int calculateHowManySaturdaysAndSundays(int sumOfCoursesDuration, LocalDateTime startDate) {
        int weekendDays = 0;

        for (int i = 0; i <= (sumOfCoursesDuration / 8 + weekendDays - 1); i++) {
            if ((Objects.equals(String.valueOf(startDate.plusDays(i).getDayOfWeek()), "SATURDAY"))) {

                weekendDays += 2;

            }
        }
        if (sumOfCoursesDuration % 8 != 0 && (Objects.equals(String.valueOf(startDate.plusDays((sumOfCoursesDuration / 8)).plusDays(weekendDays).getDayOfWeek()), "SATURDAY"))) {
            weekendDays += 2;
        }
        System.out.println(weekendDays);
        return weekendDays;

    }
//
//    public static LocalDateTime calculateEndDate(int sumOfCoursesDuration, LocalDateTime startDate, int weekendDays) {
//        //LocalDateTime endDate = startDate.plusDays((sumOfCoursesDuration / 8) + weekendDays).plusHours(sumOfCoursesDuration % 8);
//
//        LocalDateTime endDate = startDate.plusDays((sumOfCoursesDuration / 8) + weekendDays).minusDays(1).plusHours(8);
//        if (sumOfCoursesDuration % 8 != 0) {
//
//            endDate = endDate.plusDays(1).withHour(10).plusHours(sumOfCoursesDuration % 8);
//
//        }
//        System.out.println(endDate);
//        System.out.println(startDate);
//        return endDate;
//    }
//
//
////    public static void calculateHoursFromTwoDates(LocalDate startDate, LocalDate reportDate) {
////        int remainingHoursBetweenTwoDates = 0;
////    }
//
//
//    public static void calculateDaysToTheEndOfCourseProgram(int sumOfCoursesDuration, LocalDateTime startDate, LocalDateTime reportDate) {
//        int numberOfWeekendDays = calculateHowManySaturdaysAndSundays(sumOfCoursesDuration, startDate);
//        LocalDateTime endDate = calculateEndDate(sumOfCoursesDuration, startDate, numberOfWeekendDays);
//
//        if (reportDate.getHour() > 10) {
//            int sumOf = (sumOfCoursesDuration % 8) + (18 - reportDate.getHour());
//            if (sumOf >= 8) {
//                System.out.println((endDate.minusDays(reportDate.getDayOfMonth()).minusDays(numberOfWeekendDays).getDayOfMonth()) + " days");
//                System.out.println(sumOf % 8 + " hours");
//            } else {
//                System.out.println((endDate.minusDays(reportDate.getDayOfMonth()).minusDays(numberOfWeekendDays).getDayOfMonth()) + " days");
//                System.out.println(sumOf + " hours");
//            }
//        } else {
//            System.out.println((endDate.minusDays(reportDate.getDayOfMonth()).minusDays(numberOfWeekendDays).getDayOfMonth()));
//            System.out.println(" days");
//            System.out.println((sumOfCoursesDuration % 8));
//            System.out.println(" hours");
//        }
//
//
//        System.out.println(endDate.getHour());
//        System.out.println(reportDate.getHour());
//        //return endDate.getHour() + "days" + reportDate.getHour() + "hours";
//    }


}



