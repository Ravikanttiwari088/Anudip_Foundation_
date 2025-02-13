//Method Overloading
class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int sum1 = calculator.add(6, 12);
        System.out.println("Sum of two numbers (5 + 10): " + sum1);

        int sum2 = calculator.add(6, 11, 22);
        System.out.println("Sum of three numbers (5 + 10 + 15): " + sum2);
    }
}
/*
 * Sum of two numbers (5 + 10): 18
 * Sum of three numbers (5 + 10 + 15): 39
 * 
 */
