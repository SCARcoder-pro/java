import java.util.Scanner;

// Parent class
class BasicCalculator {

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }
}

// Child class 1
class AdvancedCalculator extends BasicCalculator {

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
}

// Child class 2
class ScientificCalculator extends AdvancedCalculator {

    double power(double a, double b) {
        return Math.pow(a, b);
    }

    double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Invalid number!");
            return 0;
        }
        return Math.sqrt(a);
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ScientificCalculator calc =
            new ScientificCalculator();

        System.out.println("===== SCIENTIFIC CALCULATOR =====");

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Power");
        System.out.println("6. Square Root");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        double num1, num2;

        switch (choice) {

            case 1:
                System.out.print("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                System.out.println("Result: " +
                    calc.add(num1, num2));
                break;

            case 2:
                System.out.print("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                System.out.println("Result: " +
                    calc.subtract(num1, num2));
                break;

            case 3:
                System.out.print("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                System.out.println("Result: " +
                    calc.multiply(num1, num2));
                break;

            case 4:
                System.out.print("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                System.out.println("Result: " +
                    calc.divide(num1, num2));
                break;

            case 5:
                System.out.print("Enter base: ");
                num1 = sc.nextDouble();
                System.out.print("Enter exponent: ");
                num2 = sc.nextDouble();
                System.out.println("Result: " +
                    calc.power(num1, num2));
                break;

            case 6:
                System.out.print("Enter a number: ");
                num1 = sc.nextDouble();
                System.out.println("Result: " +
                    calc.squareRoot(num1));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}