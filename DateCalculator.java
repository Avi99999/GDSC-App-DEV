import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;
import java.util.Scanner;

public class DateCalculator {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the year: ");
        int dayOfYear = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        LocalDate date = LocalDate.ofYearDay(year, dayOfYear);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = date.format(formatter);

        int weekOfYear = date.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR);

        boolean isLeapYear = date.isLeapYear();

        System.out.println("Date: " + formattedDate);
        System.out.println("Week of the year: " + weekOfYear);
        System.out.println("Leap year: " + isLeapYear);
    }
}