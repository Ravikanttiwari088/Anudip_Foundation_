import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BankAccount {
    //private variables
    private String accountHolderName;
    private String accountNumber;
    private String accountType;
    private double balance;

    // Constructor for default account
    public BankAccount() {
        this.accountHolderName = "Default Holder";
        this.accountNumber = "NA";
        this.accountType = "NA";
        this.balance = 0.00; // Default initial balance
    }

    // Constructor for custom account
    public BankAccount(String accountHolderName, String accountNumber, String accountType, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + balance);
        System.out.println("------------------------------");
    }
}

public class BankManagementSystem {
    private List<BankAccount> accounts;

    public BankManagementSystem() {
        accounts = new ArrayList<>();
    }

    
    public void createDefaultAccount() {
        BankAccount defaultAccount = new BankAccount();
        accounts.add(defaultAccount);
        System.out.println("Default account created successfully!");
    }


    public void createCustomAccount(String name, String number, String type, double balance) {
        BankAccount customAccount = new BankAccount(name, number, type, balance);
        accounts.add(customAccount);
        System.out.println("Custom account created successfully!");
    }


    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }
        
        for (BankAccount account : accounts) {
            account.displayAccountDetails();    
        }
    }
       public static void main(String[] args) {
        BankManagementSystem system = new BankManagementSystem();
        Scanner scanner = new Scanner(System.in);
      
        while (true) {
            System.out.println("Welcome to the Bank Account Management System");
            System.out.println("1. Create Default Account");
            System.out.println("2. Create Custom Account");
            System.out.println("3. Display All Accounts");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    system.createDefaultAccount();
                    break;
                  
                case 2:
                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Account Number: ");
                    String number = scanner.nextLine();
                    System.out.print("Enter Account Type (Savings/Current): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();
                    system.createCustomAccount(name, number, type, balance); //all the value get assigned to this variables
                    break;
                case 3:
                    system.displayAllAccounts();
                    break;
                case 4:
                    System.out.println("Done, Thank you!");
                    scanner.close();
                    return;
                default:
             
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println(); 
        }
    }
}

