import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        calculateAverageMarks();
    }

    public static void calculateAverageMarks() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for Java Programming:");
        double javaMarks = scanner.nextDouble();

        System.out.println("Enter marks for Networking:");
        double networkingMarks = scanner.nextDouble();

        System.out.println("Enter marks for Maths:");
        double mathsMarks = scanner.nextDouble();

        double averageMarks = (javaMarks + networkingMarks + mathsMarks) / 3;

        System.out.println("Marks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + averageMarks);

        scanner.close();
    }
}
