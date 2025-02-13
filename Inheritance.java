import java.util.Scanner;

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

class Student extends Person {

    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study() {
        System.out.println("I am studying: " + grade + ".");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your grade: ");
        String grade = scanner.nextLine();

        Student student = new Student(name, age, grade);

        student.speak();
        student.study();

        scanner.close();

    }
}

/*
 * OUTPUT
 * Enter your name: Ravikant Tiwari
 * Enter your age: 22
 * Enter your grade: Engineering
 * My name is Ravikant Tiwari and I am 22 years old.
 * I am studying: Engineering.
 */
