import java.util.Scanner;

public class ReverseString {
    //Main Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();
        //Inbuilt Function Used
        String reversedString = new StringBuilder(inputString).reverse().toString();

        System.out.println("Reversed String: " + reversedString);
        scanner.close();
    }
}

/* Output
 Enter a string to reverse: Devil
Reversed String: liveD
 */