import java.util.Scanner;

public class ReverseNumber {
    //Main Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;

        //Logic for Number Reverse

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversedNumber);
        scanner.close();
    }
}
/* Output
 Enter a number to reverse: 12
Reversed Number: 21
 */