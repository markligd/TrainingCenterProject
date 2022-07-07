import java.time.LocalDateTime;

public class Calculations {

    private Student student;
    //    private int coursesDuration;
    private LocalDateTime reportTime;

    public Calculations(Student student) {
        this.student = student;
        this.reportTime = LocalDateTime.now();
    }

    public int calculateDuration() {
        int a = 0;
        for (Course i : student.getNewList()) {
            a += i.getDuration();

        }
        return a;
    }

////    public static void sumCoursesDuration(List<Course>, LocalDateTime startDate, LocalDateTime reportDate) {
////        int sumOFCoursesDuration = 0;
////        for (Integer value : Course.ge) {
////            sumOFCoursesDuration += value;
////        }
//
//        AtomicReference<Integer> weekendDays = new AtomicReference<>(0);
//        IntStream.range(1, sumOFCoursesDuration / 8 + 1).forEachOrdered(n -> {
//            if (Objects.equals(String.valueOf(startDate.plusDays(n).getDayOfWeek()), "SATURDAY") || Objects.equals(String.valueOf(startDate.plusDays(n).getDayOfWeek()), "SUNDAY")) {
//                weekendDays.set(weekendDays.get() + 1);
//            }
//
//        });
//        LocalDateTime endDate = startDate.plusDays((sumOFCoursesDuration / 8) + weekendDays.get()).plusHours(sumOFCoursesDuration % 8);
////        Duration duration = Duration.between(reportDate, endDate);
//
//        System.out.println(endDate);
//        System.out.println(reportDate);
//
////        System.out.println(endDate.minusDays(reportDate.getDayOfMonth()).minusDays(weekendDays.get()).getDayOfMonth());
////        System.out.println((18 - reportDate.getHour() + endDate.getHour()-10));
//
//        if (reportDate.getHour() > 10) {
//            int sumof = (sumOFCoursesDuration % 8) + (18 - reportDate.getHour());
//            if (sumof >= 8) {
//                System.out.println((endDate.minusDays(reportDate.getDayOfMonth()).minusDays(weekendDays.get()).getDayOfMonth() + 1));
//                System.out.println(sumof % 8);
//            } else {
//                System.out.println((endDate.minusDays(reportDate.getDayOfMonth()).minusDays(weekendDays.get()).getDayOfMonth()));
//                System.out.println(sumof);
//            }
//        } else {
//            System.out.println((endDate.minusDays(reportDate.getDayOfMonth()).minusDays(weekendDays.get()).getDayOfMonth()));
//            System.out.println((sumOFCoursesDuration % 8));
//        }
//
//
////        System.out.println(reportDate.minusHours(endDate.getHour()).getHour());
//        System.out.println(endDate.getHour());
//        System.out.println(reportDate.getHour());
//    }
//
//    System.out.println("Enter launch date of first person DD-MM-YYYY");
//    String input = "2022-07-11 10:00:00";
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//
//    LocalDateTime startDate = LocalDateTime.parse(input, formatter);
//    //        LocalDateTime reportDate = LocalDateTime.now();
//    LocalDateTime reportDate = LocalDateTime.parse("2022-07-13 12:00:00", formatter);
//
//


}