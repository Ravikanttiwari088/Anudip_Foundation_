import java.util.Scanner;

public class EmployeeAllowance {

    //Main Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();

        double da = salary * 0.12; // Dearness Allowance
        double hra = salary * 0.13; // House Rent Allowance
        double pf = salary * 0.15; // Provident Fund
        double gross = salary + da + hra - pf; // Gross Salary

        System.out.printf("Dearness Allowance (DA): %.2f%n", da);
        System.out.printf("House Rent Allowance (HRA): %.2f%n", hra);
        System.out.printf("Provident Fund (PF): %.2f%n", pf);
        System.out.printf("Gross Salary: %.2f%n", gross);

        scanner.close();
    }
}

//Output

/*
Enter the salary of the employee: 80000
Dearness Allowance (DA): 9600.00
House Rent Allowance (HRA): 10400.00
Provident Fund (PF): 12000.00
Gross Salary: 88000.00
 */