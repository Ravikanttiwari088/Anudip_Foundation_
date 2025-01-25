import java.util.Scanner;

public class LeapYear {
    // main Function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Logic to check LeapYear
        if ((year % 4 == 0 && year % 100 != 0)  || (year % 400 == 0))
         /* if it is divisible by 4 and not divisible by 100 , it is a Leap Year .
        or if, it is divisible by 400 then also it is a leap year*/
         {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }
}

/*Output

Enter a year: 2024
2024 is a leap year.*/