import java.time.DayOfWeek;
import java.time.LocalDateTime;


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
        for (int i = 1; i <= (sumOfCoursesDuration / 8 + weekendDays); i++) {
            if (startDate.plusDays(i).getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                weekendDays += 2;
            }
        }

        if ((startDate.getHour() + sumOfCoursesDuration % 8) > 18) {
            if (startDate.plusDays((sumOfCoursesDuration / 8)).plusDays(weekendDays + 1).getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                weekendDays += 2;
            }
        }
        System.out.println("Weekend days: " + weekendDays);
        return weekendDays;
    }

    public static LocalDateTime calculateEndDate(int sumOfCoursesDuration, LocalDateTime startDate, int weekendDays) {
        LocalDateTime endDate = startDate.plusDays((sumOfCoursesDuration / 8) + weekendDays);


        if (((sumOfCoursesDuration % 8) + (startDate.getHour())) > 18) {
            endDate = endDate.plusDays(1).withHour(10).plusHours(((sumOfCoursesDuration % 8) + (startDate.getHour())) - 18);

            if (endDate.getHour() == 10 && endDate.minusDays(1).getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                endDate = endDate.minusDays(3).withHour(10).plusHours(8);

            } else if (endDate.getHour() == 10 && endDate.minusDays(1).getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                endDate = endDate.minusDays(2).withHour(10).plusHours(8);


            } else if (endDate.getHour() == 10 && (endDate.minusDays(1).getDayOfWeek() != DayOfWeek.SUNDAY || endDate.minusDays(1).getDayOfWeek() != DayOfWeek.SATURDAY)) {
                endDate = endDate.minusDays(1).withHour(10).plusHours(8);
            }

        }
        if (((sumOfCoursesDuration % 8) + (startDate.getHour())) <= 18) {
            endDate = endDate.plusHours(sumOfCoursesDuration % 8);
            System.out.println(startDate.getHour());
            if (endDate.getHour() == 10 && endDate.minusDays(1).getDayOfWeek().equals(DayOfWeek.SUNDAY)) {

                endDate = endDate.minusDays(3).withHour(10).plusHours(8);

            } else if (endDate.getHour() == 10 && endDate.minusDays(1).getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                endDate = endDate.minusDays(2).withHour(10).plusHours(8);


            } else if (endDate.getHour() == 10 && (endDate.minusDays(1).getDayOfWeek() != DayOfWeek.SUNDAY || endDate.minusDays(1).getDayOfWeek() != DayOfWeek.SATURDAY)) {
                endDate = endDate.minusDays(1).withHour(10).plusHours(8);
            }

        }

        if (endDate.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
            endDate = endDate.plusDays(2);
        } else if (endDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            endDate = endDate.plusDays(1);

        }


        System.out.println("Start date: " + startDate);
        System.out.println("End date:   " + endDate);
        return endDate;


    }


    public static void calculateDaysToTheEndOfCourseProgram(int sumOfCoursesDuration, LocalDateTime startDate, LocalDateTime reportDate) {
        int numberOfWeekendDays = calculateHowManySaturdaysAndSundays(sumOfCoursesDuration, startDate);
        LocalDateTime endDate = calculateEndDate(sumOfCoursesDuration, startDate, numberOfWeekendDays);


//        Duration duration = Duration.between(endDate, reportDate);
//        System.out.println(duration + " duration");
//        Period period = Period.between(endDate.toLocalDate(), reportDate.toLocalDate());
//        System.out.println(period + " period");

//        PeriodType ptype = PeriodType.yearMonthDayTime();
//        Period diff = new Period(startDate, endDate, ptype);
//        System.out.println(diff);


        //return endDate.getHour() + "days" + reportDate.getHour() + "hours to the END of the ";
    }
}

