
import java.time.LocalDate;

import java.time.Period;
import java.util.Scanner;

public class DateAndTimeEx2 {

    public static void main(String[] args) {
        //first date
        LocalDate date1 = createDate();

        // second date
        LocalDate date2 = createDate();


        compareDates(date1, date2);
    }

    private static void compareDates(LocalDate date1, LocalDate date2) {

        boolean compareDates = date1.isAfter(date2);
        if (compareDates)
            timeBetweenDates(date2,date1);

        else
            timeBetweenDates(date1,date2);


    }

    private static void timeBetweenDates(LocalDate date1, LocalDate date2) {
        System.out.println("Later date: " + date2);
        Period period = Period.between(date1,date2);
        System.out.println("Provided dates are separated by: " +
                period.getYears()
                + " years, "
                + period.getMonths()
                + " months, "
                + period.getDays()
                + " days");
    }

    private static LocalDate createDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide day of month:");
        int day = scanner.nextInt();
        System.out.println("Provide month:");
        int month = scanner.nextInt();
        System.out.println("Provide year:");
        int year = scanner.nextInt();
        System.out.println();
        return LocalDate.of(year,month,day);
    }

}
