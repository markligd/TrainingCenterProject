import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class Calculations {
    public static void sumCoursesDuration(Map<String, Integer> Position, LocalDateTime startDate, LocalDateTime reportDate) {
        int sumOFCoursesDuration = 0;
        for (Integer value : Position.values()) {
            sumOFCoursesDuration += value;
        }

        AtomicReference<Integer> weekendDays = new AtomicReference<>(0);
        IntStream.range(1, sumOFCoursesDuration / 8 + 1).forEachOrdered(n -> {
            if (Objects.equals(String.valueOf(startDate.plusDays(n).getDayOfWeek()), "SATURDAY") || Objects.equals(String.valueOf(startDate.plusDays(n).getDayOfWeek()), "SUNDAY")) {
                weekendDays.set(weekendDays.get() + 1);
            }

        });
        LocalDateTime endDate = startDate.plusDays((sumOFCoursesDuration / 8) + weekendDays.get()).plusHours(sumOFCoursesDuration % 8);
//        Duration duration = Duration.between(reportDate, endDate);

        System.out.println(endDate);
        System.out.println(reportDate);

//        System.out.println(endDate.minusDays(reportDate.getDayOfMonth()).minusDays(weekendDays.get()).getDayOfMonth());
//        System.out.println((18 - reportDate.getHour() + endDate.getHour()-10));

        if (reportDate.getHour() > 10) {
            int sumof = (sumOFCoursesDuration % 8) + (18 - reportDate.getHour());
            if (sumof >= 8) {
                System.out.println((endDate.minusDays(reportDate.getDayOfMonth()).minusDays(weekendDays.get()).getDayOfMonth() + 1));
                System.out.println(sumof % 8);
            } else {
                System.out.println((endDate.minusDays(reportDate.getDayOfMonth()).minusDays(weekendDays.get()).getDayOfMonth()));
                System.out.println(sumof);
            }
        } else {
            System.out.println((endDate.minusDays(reportDate.getDayOfMonth()).minusDays(weekendDays.get()).getDayOfMonth()));
            System.out.println((sumOFCoursesDuration % 8));
        }


//        System.out.println(reportDate.minusHours(endDate.getHour()).getHour());
        System.out.println(endDate.getHour());
        System.out.println(reportDate.getHour());
    }
}