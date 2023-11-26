import java.util.Scanner;

public class TriangleAreaCalculator {
    double base;
    double height;
    double area;

    public static void main(String[] args) {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        calculator.inputDimensions();
        calculator.calculateArea();
        calculator.displayArea();
    }

    public void inputDimensions() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of the triangle:");
        base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle:");
        height = scanner.nextDouble();

        scanner.close();
    }

    public void calculateArea() {
        area = 0.5 * base * height;
    }

    public void displayArea() {
        System.out.println("The area of the triangle is: " + area);
    }
}
