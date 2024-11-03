import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Mini Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Choose an operation: ");
            int operation = scanner.nextInt();

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (operation) {
                case 1 -> System.out.println("Result: " + (num1 + num2));
                case 2 -> System.out.println("Result: " + (num1 - num2));
                case 3 -> System.out.println("Result: " + (num1 * num2));
                case 4 -> System.out.println("Result: " + (num1 / num2));
                default -> System.out.println("Invalid operation.");
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
}
