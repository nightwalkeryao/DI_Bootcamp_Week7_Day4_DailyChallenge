import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

public class UseDate {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();

		System.out.println(localDate.getDayOfWeek());

		LocalDate Date1 = askDate();

		System.out.println(Date1.getDayOfWeek());

		LocalDate birthday = LocalDate.of(1999, 10, 01);

		System.out.println(birthday.getDayOfWeek());

		LocalDate birthdayDate = askDate();

		Period age = Period.between(birthdayDate, localDate);

		System.out.println(" You are " + age.getYears() + " Years Old ");

		System.out.println("Day generated " + randomDay(2023) + " : " + randomDay(2022).getDayOfWeek());

	}

	public static LocalDate askDate() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the year");

		int year = sc.nextInt();

		System.out.println("Enter the Month");

		int month = sc.nextInt();

		System.out.println("Enter the day Of Month like 31");

		int dayOfMonth = sc.nextInt();
		sc.close();

		return LocalDate.of(year, month, dayOfMonth);
	}

	public static LocalDate randomDay(int year) {
		int dayOfYear = new Random().nextInt(1, 366);
		
		return LocalDate.ofYearDay(year, dayOfYear);
	}

}
