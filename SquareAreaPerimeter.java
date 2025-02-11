import java.util.Scanner;

public class SquareAreaPerimeter {
    //Main class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the side of the square: ");
        double side = scanner.nextDouble();

        double perimeter = 4 * side; // Perimeter formula
        double area = side * side; // Area formula

        System.out.printf("Perimeter of the square: %.2f%n", perimeter);
        System.out.printf("Area of the square: %.2f%n", area);

        scanner.close();
    }
}
    
//Output

/*
Enter the length of the side of the square: 5
Perimeter of the square: 20.00
Area of the square: 25.00
 */
