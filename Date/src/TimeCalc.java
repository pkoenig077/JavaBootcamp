import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*Write a Java console application to calculate the duration between two dates in Years,
Months and Days. The user should enter two dates as input, then the program will show the
result of the difference in time between these two dates. 
*/
public class TimeCalc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a date in ISO-8601 format (year-month-date)");//input format must be exact or exception will be thrown 
		
		String dateInput1 = input.nextLine();
		
		System.out.println("Enter another date in ISO-8601 format (year-month-date)");
		
		String dateInput2 = input.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;//reads dates formatted in ISO-8601 format e.g 2015-01-01 for Jan 01 2015
		
		LocalDate date1 = LocalDate.parse(dateInput1, formatter);
		LocalDate date2 = LocalDate.parse(dateInput2, formatter);
		
		System.out.println(ChronoUnit.DAYS.between(date1, date2));//calculates the days between the inputed dates
	}
}
