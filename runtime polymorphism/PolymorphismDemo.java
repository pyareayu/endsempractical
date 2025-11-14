// Runtime Polymorphism Example in Java

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {

        Animal animal; // reference of parent class

        animal = new Dog();  // Dog object
        animal.sound();      // Output: Dog barks

        animal = new Cat();  // Cat object
        animal.sound();      // Output: Cat meows

    }
}
