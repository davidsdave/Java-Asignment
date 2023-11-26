import java.util.Random;

public class Program {
    private int value;

    // Constructor
    public Program(int value) {
        this.value = value;
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("Executing non-static method with value: " + value);
    }

    // Static method 1
    public static void staticMethod1() {
        System.out.println("Executing static method 1");
    }

    // Static method 2
    public static void staticMethod2() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Executing static method 2 with random number: " + randomNumber);
    }

    public static void main(String[] args) {
        // Creating an instance using the constructor
        Program instance = new Program(10);

        // Calling the non-static method using the instance
        instance.nonStaticMethod();

        // Calling the static methods directly
        staticMethod1();
        staticMethod2();
    }
}
