// Task 2: Method Overriding
class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow"); // Input
    }
}

public class AnimalTest {
    public static void main(String[] args) {

        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();

        myCat.makeSound();
    }
}

/*
 * OUTPUT
 * Bark
 * Meow
 * 
 */
