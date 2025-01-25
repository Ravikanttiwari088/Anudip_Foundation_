import java.util.Scanner;

public class VotingEligibility {

    //Main Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        //Logic to check eligibility
        if (age >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
        scanner.close();
    }
}

/*
Output

Enter your age: 25
Eligible to vote.
 */