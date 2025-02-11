import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Celsius to Farenheit

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = ((celsius * 9) / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        //Farenheit to Celsius

        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Temperature in Celsius: " + celsius);
        scanner.close();
    }
}

//Output

/*
Enter temperature in Celsius: 32
Temperature in Fahrenheit: 89.6
Enter temperature in Fahrenheit: 104
Temperature in Celsius: 40.0 
*/
