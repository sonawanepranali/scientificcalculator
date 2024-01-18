import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            double result = 0.0;

            switch (choice) {
                case 1:
                    result = performAddition();
                    break;
                case 2:
                    result = performSubtraction();
                    break;
                case 3:
                    result = performMultiplication();
                    break;
                case 4:
                    result = performDivision();
                    break;
                case 5:
                    result = performSquareRoot();
                    break;
                case 6:
                    result = performExponentiation();
                    break;
                case 7:
                    result = performTrigonometricFunction("sine");
                    break;
                case 8:
                    result = performTrigonometricFunction("cosine");
                    break;
                case 9:
                    result = performTrigonometricFunction("tangent");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

            System.out.println("Result: " + result);
            System.out.println();
        }

        scanner.close();
    }

    private static double performAddition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    private static double performSubtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    private static double performMultiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    private static double performDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor == 0) {
            System.out.println("Error: Division by zero is undefined.");
            return 0;
        }

        return dividend / divisor;
    }

    private static double performSquareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        return Math.sqrt(num);
    }

    private static double performExponentiation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        return Math.pow(base, exponent);
    }

    private static double performTrigonometricFunction(String functionName) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle in radians: ");
        double angle = scanner.nextDouble();

        switch (functionName.toLowerCase()) {
            case "sine":
                return Math.sin(angle);
            case "cosine":
                return Math.cos(angle);
            case "tangent":
                return Math.tan(angle);
            default:
                System.out.println("Invalid trigonometric function.");
                return 0;
        }
    }
}

