import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = ((celsius * 9) / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
