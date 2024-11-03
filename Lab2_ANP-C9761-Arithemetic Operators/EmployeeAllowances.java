import java.util.Scanner;

public class EmployeeAllowances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        
        double da = 0.12 * salary;
        double hra = 0.13 * salary;
        double pf = 0.15 * salary;
        double gross = salary + da + hra - pf;
        
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + gross);
    }
}
