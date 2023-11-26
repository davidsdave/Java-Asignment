import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("The year you entered is a leap year.");
        } else {
            System.out.println("The year you entered is not a leap year.");
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        // Leap year conditions:
        // 1. If the year is divisible by 4
        // 2. If the year is not divisible by 100, except if it's also divisible by 400

        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}
